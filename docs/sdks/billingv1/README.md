# BillingV1
(*billingV1*)

### Available Operations

* [getBalance](#getbalance)
* [getInvoices](#getinvoices)
* [getPaymentMethod](#getpaymentmethod)
* [initStripeCustomerPortalUrl](#initstripecustomerportalurl)

## getBalance

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.GetBalanceResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("minus") {{
                    auth0 = "";
                }})
                .build();

            GetBalanceResponse res = sdk.billingV1.getBalance();

            if (res.getBalance200ApplicationJSONDoubleNumber != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[dev.hathora.cloud_api.models.operations.GetBalanceResponse](../../models/operations/GetBalanceResponse.md)**


## getInvoices

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.GetInvoicesResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("placeat") {{
                    auth0 = "";
                }})
                .build();

            GetInvoicesResponse res = sdk.billingV1.getInvoices();

            if (res.invoices != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[dev.hathora.cloud_api.models.operations.GetInvoicesResponse](../../models/operations/GetInvoicesResponse.md)**


## getPaymentMethod

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.GetPaymentMethodResponse;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("voluptatum") {{
                    auth0 = "";
                }})
                .build();

            GetPaymentMethodResponse res = sdk.billingV1.getPaymentMethod();

            if (res.paymentMethod != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[dev.hathora.cloud_api.models.operations.GetPaymentMethodResponse](../../models/operations/GetPaymentMethodResponse.md)**


## initStripeCustomerPortalUrl

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.HathoraCloud;
import dev.hathora.cloud_api.models.operations.InitStripeCustomerPortalUrlResponse;
import dev.hathora.cloud_api.models.shared.CustomerPortalUrl;
import dev.hathora.cloud_api.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .setSecurity(new Security("iusto") {{
                    auth0 = "";
                }})
                .build();

            dev.hathora.cloud_api.models.shared.CustomerPortalUrl req = new CustomerPortalUrl("excepturi");            

            InitStripeCustomerPortalUrlResponse res = sdk.billingV1.initStripeCustomerPortalUrl(req);

            if (res.initStripeCustomerPortalUrl200ApplicationJSONString != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [dev.hathora.cloud_api.models.shared.CustomerPortalUrl](../../models/shared/CustomerPortalUrl.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[dev.hathora.cloud_api.models.operations.InitStripeCustomerPortalUrlResponse](../../models/operations/InitStripeCustomerPortalUrlResponse.md)**

