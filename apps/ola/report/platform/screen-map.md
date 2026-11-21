# Screen Map — com.olacabs.customer

`sha256: bac41dddac659fc107fd8960675aefb78ed2e8a6e590d91a2385569bceb773b3`
113 manifest activities mapped to user-visible screens (obs for existence; grouping inf). RN screens inside `index.android.bundle` are Hermes bytecode — not enumerable statically (unk count).

## Core app
- `NewSplashActivity` (launcher) → `yoda.rearch.core.NewMainActivity` (home/booking shell)
- `yoda.rearch.upgrade.ForceUpgradeActivity` — forced update gate
- `DeeplinkActivity` — link router
- `RestartActivity` (`:restart`) — crash restart
- `ThirdPartyIntentActivity` — external intent handling

## Auth/account (~12)
`BaseLoginSignUpActivity`, `MobileVerificationActivity` (`:restart`), `VerifyMobileNoActivity`, `ValidateOTPActivity`, `LoginWithPasswordActivity`, `VerifyAccountActivity`, `SetPasswordActivity`, `CreateOlaAccountActivity`, `VerifyEmailActivity`, `ChangeEmailNewLoginActivity`, `ChangePasswordActivity`, `EmailVerificationActivity`, `AccountBlockedActivity`, `AccountReactivateActivity`, `yoda.ui.profile.VerifyPasswordActivity`, `yoda.ui.profile.TwoStepVerificationActivity`, `yoda.ui.login.IvrActivity` (IVR OTP fallback)

## Booking/support
`yoda.oe.prebook.cards.*` (Epoxy card templates — server-driven pre-booking feed, inf), `SelfServeActivity`, `OlaWebViewActivity`, `CommonWebViewActivity`, `com.ola.mapsorchestrator.showcase.ShowCaseActivity`

## SOS (`yoda.sos.ui`)
`SosActivity`, `SosCountdownActivity`, `SosAlertActivity`, `AddEmergencyContactActivity`

## Ola Money (~26 screens)
`OlaMoneyActivity` (exported hub), `PaymentActivity`, `PayActivity`, `LoadActivity`, `SendPayActivity`, `MerchantPayActivity`, `P2PActivity`, `CircleUtilityActivity`, `BBPSActivity`, `RechargePayUActivity`, `AutoRechargeActivity`, `RechargeOfferScreenActivity`, `OMTransactionsActivity`, `OMTransactionDetailActivity`, `OMPostpaidActivity`, `PostpaidActivatedActivity`, `PersonalLoanActivity`, `PLPitchPageActivity`, `CreditProtecttileScreen`, `KYCActivity`, `kyc.{Camera,Crop,Review}Activity`, `SimBindingActivity`, `PermissionActivity`, `TransactionComplaintActivity`, `TemperoryTransactionActivity`, `OlaMoneyCarouselActivity`, `DiscoverableCouponsActivity`, `SiScreenActivity`, `WebViewActivity` (exported), `UPIActivity`, `TwoFactorFromCabsActivity`, `RazorpayPaymentActivity` (exported)

## UPI
`AddVPAActivity`, `ReAuthActivity`, `VpaDetailActivity` + Razorpay turbo (`LinkedAccounts`, `ManageAccount`, `BankSelection`, `CardDetails`, `Success`, `RewardSuccess`, `BottomSheetTransparent`) + NPCI `UserAuthInfoActivity`, `GetCredential`

## Payments RN
`PaymentReactActivity` → RN root `OlaPaymentsReact`; `in.juspay.hypersdkreact.ProcessActivity`

## Other
- `corporate.ui.{CorporateRideReason,CorporateExpenseCode}Activity`
- `insurance.ui.activities.AddOnProfileActivity`
- `yoda.ui.referral.ApplyReferralCodeActivity`
- `yoda.rearch.marketingconsent.MarketingConsentActivity`
- `yoda.rearch.olaelectric.OlaElectricWebActivity`
- `com.olaelectric.ola_finance.views.FinanceActivity`
- `payments.ui.cards.ChooseYourBankActivity`, `yoda.rearch.payment.sidemenu.AddInstrumentActivity`
- `qrcode_reader.{QrCode,QrCodeAuto}Activity`
- `com.moe.pushlibrary.activities.MoEActivity`, `moengage.pushbase.*` (push UX)
- `in.juspay.hypersdk.core.*` (Customtab, RedirectResponse), `hypernfc.NfcActivity`
- `com.amazon.*` pay/auth activities; `com.facebook.*` CustomTab; `com.google.android.gms.*` signin/api
- `com.chuckerteam.chucker.internal.ui.*` (HTTP inspector — internal)
- `com.google.android.libraries.ads.mobile.sdk.common.AdActivity` (ads)

## Unknowns
- RN-internal screens/routes (Hermes bytecode not decoded).
- Exact fragment-level navigation inside `NewMainActivity` (bottom-nav structure not extracted — unk; inf bottom-nav from sidemenu/card classes).
