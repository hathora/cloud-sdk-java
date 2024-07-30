# BillingV1
(*billingV1()*)

## Overview

 

### Available Operations

* [getBalance](#getbalance)
* [getInvoices](#getinvoices)
* [getPaymentMethod](#getpaymentmethod)
* [initStripeCustomerPortalUrl](#initstripecustomerportalurl)

## getBalance

### Example Usage

```java
package hello.world;

import com.hathora.cloud_api.HathoraCloud;
import com.hathora.cloud_api.models.operations.*;
import com.hathora.cloud_api.models.shared.*;
import com.hathora.cloud_api.models.shared.Security;
import com.hathora.cloud_api.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

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
        } catch (com.hathora.cloud_api.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_api.models.errors.SDKError e) {
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

**[com.hathora.cloud_api.models.operations.GetBalanceResponse](../../models/operations/GetBalanceResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## getInvoices

### Example Usage

```java
package hello.world;

import com.hathora.cloud_api.HathoraCloud;
import com.hathora.cloud_api.models.operations.*;
import com.hathora.cloud_api.models.shared.*;
import com.hathora.cloud_api.models.shared.Security;
import com.hathora.cloud_api.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

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
        } catch (com.hathora.cloud_api.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_api.models.errors.SDKError e) {
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

**[com.hathora.cloud_api.models.operations.GetInvoicesResponse](../../models/operations/GetInvoicesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## getPaymentMethod

### Example Usage

```java
package hello.world;

import com.hathora.cloud_api.HathoraCloud;
import com.hathora.cloud_api.models.operations.*;
import com.hathora.cloud_api.models.shared.*;
import com.hathora.cloud_api.models.shared.Security;
import com.hathora.cloud_api.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

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
        } catch (com.hathora.cloud_api.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_api.models.errors.SDKError e) {
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

**[com.hathora.cloud_api.models.operations.GetPaymentMethodResponse](../../models/operations/GetPaymentMethodResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429,500        | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |

## initStripeCustomerPortalUrl

### Example Usage

```java
package hello.world;

import com.hathora.cloud_api.HathoraCloud;
import com.hathora.cloud_api.models.operations.*;
import com.hathora.cloud_api.models.shared.*;
import com.hathora.cloud_api.models.shared.Security;
import com.hathora.cloud_api.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

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
        } catch (com.hathora.cloud_api.models.errors.ApiError e) {
            // handle exception
            throw e;
        } catch (com.hathora.cloud_api.models.errors.SDKError e) {
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

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [com.hathora.cloud_api.models.shared.CustomerPortalUrl](../../models/shared/CustomerPortalUrl.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[com.hathora.cloud_api.models.operations.InitStripeCustomerPortalUrlResponse](../../models/operations/InitStripeCustomerPortalUrlResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/ApiError | 401,404,429            | application/json       |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
