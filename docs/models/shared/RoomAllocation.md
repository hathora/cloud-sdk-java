# RoomAllocation

Metadata on allocated instances of a room.


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `processId`                                                                               | *String*                                                                                  | :heavy_check_mark:                                                                        | System generated unique identifier to a runtime instance of your game server.             | cbfcddd2-0006-43ae-996c-995fff7bed2e                                                      |
| `roomAllocationId`                                                                        | *String*                                                                                  | :heavy_check_mark:                                                                        | System generated unique identifier to an allocated instance of a room.                    | e3a0aa32-1711-4036-acfa-008b96061a78                                                      |
| `scheduledAt`                                                                             | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_check_mark:                                                                        | N/A                                                                                       |                                                                                           |
| `unscheduledAt`                                                                           | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_check_mark:                                                                        | N/A                                                                                       |                                                                                           |