# billingV1

### Available Operations

* [getBalance](#getbalance)
* [getInvoices](#getinvoices)
* [getPaymentMethod](#getpaymentmethod)
* [initStripeCustomerPortalUrl](#initstripecustomerportalurl)

## getBalance

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.GetBalanceResponse;
import dev.hathora.cloud_api.models.operations.GetBalanceSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetBalanceResponse res = sdk.billingV1.getBalance(new GetBalanceSecurity("suscipit") {{
                auth0 = "";
            }});

            if (res.getBalance200ApplicationJSONDoubleNumber != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                  | [dev.hathora.cloud_api.models.operations.GetBalanceSecurity](../../models/operations/GetBalanceSecurity.md) | :heavy_check_mark:                                                                                          | The security requirements to use for the request.                                                           |


### Response

**[dev.hathora.cloud_api.models.operations.GetBalanceResponse](../../models/operations/GetBalanceResponse.md)**


## getInvoices

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.GetInvoicesResponse;
import dev.hathora.cloud_api.models.operations.GetInvoicesSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetInvoicesResponse res = sdk.billingV1.getInvoices(new GetInvoicesSecurity("iure") {{
                auth0 = "";
            }});

            if (res.invoices != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                    | [dev.hathora.cloud_api.models.operations.GetInvoicesSecurity](../../models/operations/GetInvoicesSecurity.md) | :heavy_check_mark:                                                                                            | The security requirements to use for the request.                                                             |


### Response

**[dev.hathora.cloud_api.models.operations.GetInvoicesResponse](../../models/operations/GetInvoicesResponse.md)**


## getPaymentMethod

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.GetPaymentMethodResponse;
import dev.hathora.cloud_api.models.operations.GetPaymentMethodSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetPaymentMethodResponse res = sdk.billingV1.getPaymentMethod(new GetPaymentMethodSecurity("magnam") {{
                auth0 = "";
            }});

            if (res.paymentMethod != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                               | Type                                                                                                                    | Required                                                                                                                | Description                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                              | [dev.hathora.cloud_api.models.operations.GetPaymentMethodSecurity](../../models/operations/GetPaymentMethodSecurity.md) | :heavy_check_mark:                                                                                                      | The security requirements to use for the request.                                                                       |


### Response

**[dev.hathora.cloud_api.models.operations.GetPaymentMethodResponse](../../models/operations/GetPaymentMethodResponse.md)**


## initStripeCustomerPortalUrl

### Example Usage

```java
package hello.world;

import dev.hathora.cloud_api.SDK;
import dev.hathora.cloud_api.models.operations.InitStripeCustomerPortalUrlResponse;
import dev.hathora.cloud_api.models.operations.InitStripeCustomerPortalUrlSecurity;
import dev.hathora.cloud_api.models.shared.CustomerPortalUrl;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            dev.hathora.cloud_api.models.shared.CustomerPortalUrl req = new CustomerPortalUrl("debitis");            

            InitStripeCustomerPortalUrlResponse res = sdk.billingV1.initStripeCustomerPortalUrl(req, new InitStripeCustomerPortalUrlSecurity("ipsa") {{
                auth0 = "";
            }});

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

| Parameter                                                                                                                                     | Type                                                                                                                                          | Required                                                                                                                                      | Description                                                                                                                                   |
| --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                     | [dev.hathora.cloud_api.models.shared.CustomerPortalUrl](../../models/shared/CustomerPortalUrl.md)                                             | :heavy_check_mark:                                                                                                                            | The request object to use for the request.                                                                                                    |
| `security`                                                                                                                                    | [dev.hathora.cloud_api.models.operations.InitStripeCustomerPortalUrlSecurity](../../models/operations/InitStripeCustomerPortalUrlSecurity.md) | :heavy_check_mark:                                                                                                                            | The security requirements to use for the request.                                                                                             |


### Response

**[dev.hathora.cloud_api.models.operations.InitStripeCustomerPortalUrlResponse](../../models/operations/InitStripeCustomerPortalUrlResponse.md)**

