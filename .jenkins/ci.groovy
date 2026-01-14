@Library('add-ons-shared-libs@develop') _

node {
    continuousIntegrationPipeline(
        buildType: "deploy",
        sonar: [
            enable: true,
            projectKey: "eclipse-kura_kura-position",
            tokenId: "sonarcloud-token-kura-position",
            exclusions: "**/*.xml,**/*.yml",
            testExclusions: "**/*"
        ],
    )
}
