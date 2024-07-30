# ProcessWithRoomsExposedPort

Connection details for an active process.


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `host`                                                                                    | *String*                                                                                  | :heavy_check_mark:                                                                        | N/A                                                                                       |
| `name`                                                                                    | *String*                                                                                  | :heavy_check_mark:                                                                        | N/A                                                                                       |
| `port`                                                                                    | *int*                                                                                     | :heavy_check_mark:                                                                        | N/A                                                                                       |
| `transportType`                                                                           | [com.hathora.cloud_api.models.shared.TransportType](../../models/shared/TransportType.md) | :heavy_check_mark:                                                                        | Transport type specifies the underlying communication protocol to the exposed port.       |