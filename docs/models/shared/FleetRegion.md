# FleetRegion

A fleet region is a region in which a fleet can be deployed.
You can update cloudMinVcpus once every five minutes. It must be a multiple of
scaleIncrementVcpus


## Fields

| Field                                                                                     | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `cloudMinVcpus`                                                                           | *int*                                                                                     | :heavy_check_mark:                                                                        | N/A                                                                                       |
| `cloudMinVcpusUpdatedAt`                                                                  | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html) | :heavy_check_mark:                                                                        | N/A                                                                                       |
| `scaleIncrementVcpus`                                                                     | *int*                                                                                     | :heavy_check_mark:                                                                        | N/A                                                                                       |