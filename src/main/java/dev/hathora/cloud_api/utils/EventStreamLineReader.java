/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.hathora.cloud_api.utils;

import java.io.IOException;
import java.io.Reader;

/**
 * Converts CR-LF, LF, CR to LF
 */
public class EventStreamLineReader extends Reader {

    private final Reader reader;
    private int lastCh = -1; // not LF nor CR

    public EventStreamLineReader(Reader reader) {
        this.reader = reader;
    }

    @Override
    public int read() throws IOException {
        if (lastCh == -1) {
            // load first character of stream
            lastCh = reader.read();
            if (lastCh == -1 || lastCh == '\n') {
                // force reload of buffered last ch
                int v = lastCh;
                lastCh = -1;
                return v;
            }
        }
        int ch = reader.read();
        if (ch == -1) {
            if (lastCh == '\r') {
                lastCh = -1;
                return '\n';
            } else {
                int v = lastCh;
                lastCh = -1;
                return v;
            }
        } else if (lastCh == '\n') {
            lastCh = ch;
            return '\n';
        } else if (lastCh == '\r' && ch == '\n') {
            // force reload of buffered last ch
            lastCh = -1;
            return '\n';
        } else if (lastCh == '\r') {
            lastCh = ch;
            return '\n';
        } else {
            int v = lastCh;
            lastCh = ch;
            return v;
        }
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void close() throws IOException {
        reader.close();
    }

}
