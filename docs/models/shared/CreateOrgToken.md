# CreateOrgToken


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       | Example                                                           |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `name`                                                            | *String*                                                          | :heavy_check_mark:                                                | Readable name for a token. Must be unique within an organization. | ci-token                                                          |
| `scopes`                                                          | [Optional\<Scopes>](../../models/shared/Scopes.md)                | :heavy_minus_sign:                                                | If not defined, the token has Admin access.                       |                                                                   |