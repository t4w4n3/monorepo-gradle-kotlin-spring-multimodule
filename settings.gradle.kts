rootProject.name = "train-ticket"
include(
    "modules:bff",
    "modules:booking:api-adapters",
    "modules:booking:api-model",
    "modules:booking:bootstrap",
    "modules:booking:domain",
    "modules:booking:persistence-adapters",
    "modules:booking:provider-adapters",
    "modules:booking:vsa-acl",
    "modules:exchange",
    "modules:shared-libs:controller",
    "modules:shared-libs:id",
    "modules:shared-libs:logging",
    "modules:shared-libs:monitoring",
)
