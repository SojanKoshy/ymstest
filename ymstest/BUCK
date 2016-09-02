BUNDLES = [
    '//apps/yms/api:onos-app-yms-api',
    '//apps/yms/app:onos-app-yms',
]

COMPILE_DEPS = [
    '//lib:CORE_DEPS',
    '//lib:org.apache.karaf.shell.console',
    '//cli:onos-cli',
    '//utils/rest:onlab-rest',
    '//lib:javax.ws.rs-api',
    '//core/store/serializers:onos-core-serializers',
]

osgi_jar (
    deps = COMPILE_DEPS,
)

onos_app (
    title = 'YMS Test App',
    category = 'Test',
    url = 'http://onosproject.org',
    description = 'YMS test application.',
    included_bundles = BUNDLES,
)
