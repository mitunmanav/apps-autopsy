# Surveys & crowdsourced feedback

Evidence: `survey_*`/`surveys_*` strings + layouts, `CrowdsourcingActivity`, `CrowdsourcingLauncherActivity`, `crowdsourcing.swiftkey.com` URL, `com.touchtype.surveys*/crowdsourcing*` classes.

## In-app surveys

- `survey_*` strings/layouts — triggered questionnaires (NPS-style/feature feedback); dismissal, skip, thank-you states.
- Trigger rules are remote-config driven (BiBo) — which survey, to whom, when.

## Crowdsourcing (data contribution)

- `CrowdsourcingLauncherActivity`/`CrowdsourcingActivity` + host `crowdsourcing.swiftkey.com` — opt-in task flows where users label/contribute data (e.g. phrase ratings used to improve models); web-backed UI.

## Other feedback

- Help & feedback settings entry → support/FAQ (helpshift-style or web), "contact us" and feedback email paths.
- Rate-us prompt path (social proof + Play store intent).

## Limits

Survey catalog and crowdsourcing task list are server-side; only the client shell is in the APK.
