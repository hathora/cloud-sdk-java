# BillingV1
(*billingV1()*)

## Overview

 

### Available Operations

* [getBalance](#getbalance)
* [getInvoices](#getinvoices)
* [getPaymentMethod](#getpaymentmethod)
* [getUpcomingInvoiceItems](#getupcominginvoiceitems)
* [getUpcomingInvoiceTotal](#getupcominginvoicetotal)
* [initStripeCustomerPortalUrl](#initstripecustomerportalurl)

## getBalance

### Example Usage

```java
package hello.world;

import com.hathora.hathora_cloud_sdk.HathoraCloud;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.GetBalanceResponse;
import com.hathora.hathora_cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            GetBalanceResponse res = sdk.billingV1().getBalance()
                .call();

            if (res.number().isPresent()) {
                // handle response
            }
        } catch (com.hathora.hathora_cloud_sdk.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Response

**[GetBalanceResponse](../../models/operations/GetBalanceResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getInvoices

### Example Usage

```java
package hello.world;

import com.hathora.hathora_cloud_sdk.HathoraCloud;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.GetInvoicesResponse;
import com.hathora.hathora_cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            GetInvoicesResponse res = sdk.billingV1().getInvoices()
                .call();

            if (res.classes().isPresent()) {
                // handle response
            }
        } catch (com.hathora.hathora_cloud_sdk.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Response

**[GetInvoicesResponse](../../models/operations/GetInvoicesResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getPaymentMethod

### Example Usage

```java
package hello.world;

import com.hathora.hathora_cloud_sdk.HathoraCloud;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.GetPaymentMethodResponse;
import com.hathora.hathora_cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            GetPaymentMethodResponse res = sdk.billingV1().getPaymentMethod()
                .call();

            if (res.paymentMethod().isPresent()) {
                // handle response
            }
        } catch (com.hathora.hathora_cloud_sdk.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Response

**[GetPaymentMethodResponse](../../models/operations/GetPaymentMethodResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429,500        | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getUpcomingInvoiceItems

### Example Usage

```java
package hello.world;

import com.hathora.hathora_cloud_sdk.HathoraCloud;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.GetUpcomingInvoiceItemsResponse;
import com.hathora.hathora_cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            GetUpcomingInvoiceItemsResponse res = sdk.billingV1().getUpcomingInvoiceItems()
                .call();

            if (res.invoiceItemPage().isPresent()) {
                // handle response
            }
        } catch (com.hathora.hathora_cloud_sdk.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Response

**[GetUpcomingInvoiceItemsResponse](../../models/operations/GetUpcomingInvoiceItemsResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getUpcomingInvoiceTotal

### Example Usage

```java
package hello.world;

import com.hathora.hathora_cloud_sdk.HathoraCloud;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.GetUpcomingInvoiceTotalResponse;
import com.hathora.hathora_cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            GetUpcomingInvoiceTotalResponse res = sdk.billingV1().getUpcomingInvoiceTotal()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (com.hathora.hathora_cloud_sdk.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Response

**[GetUpcomingInvoiceTotalResponse](../../models/operations/GetUpcomingInvoiceTotalResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## initStripeCustomerPortalUrl

### Example Usage

```java
package hello.world;

import com.hathora.hathora_cloud_sdk.HathoraCloud;
import com.hathora.hathora_cloud_sdk.models.errors.SDKError;
import com.hathora.hathora_cloud_sdk.models.operations.InitStripeCustomerPortalUrlResponse;
import com.hathora.hathora_cloud_sdk.models.shared.CustomerPortalUrl;
import com.hathora.hathora_cloud_sdk.models.shared.Security;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            HathoraCloud sdk = HathoraCloud.builder()
                .security(Security.builder()
                    .hathoraDevToken("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .appId("app-af469a92-5b45-4565-b3c4-b79878de67d2")
                .build();

            CustomerPortalUrl req = CustomerPortalUrl.builder()
                .returnUrl("<value>")
                .build();

            InitStripeCustomerPortalUrlResponse res = sdk.billingV1().initStripeCustomerPortalUrl()
                .request(req)
                .call();

            if (res.string().isPresent()) {
                // handle response
            }
        } catch (com.hathora.hathora_cloud_sdk.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [CustomerPortalUrl](../../models/shared/CustomerPortalUrl.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[InitStripeCustomerPortalUrlResponse](../../models/operations/InitStripeCustomerPortalUrlResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
