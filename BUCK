BUNDLES = [
  '//apps/test/ymstest:onos-apps-test-ymstest',
  "//lib:commons-codec",
]

COMPILE_DEPS = [
  '//lib:CORE_DEPS',
  '//lib:org.apache.karaf.shell.console',
  '//cli:onos-cli',
  '//utils/rest:onlab-rest',
  '//lib:javax.ws.rs-api',
  '//core/store/serializers:onos-core-serializers',
  '//lib:osgi-core',
  '//apps/yms/api:onos-apps-yms-api',
  '//apps/yms/app:onos-apps-yms-app',
  "//lib:commons-codec"
]

osgi_jar(
  deps = COMPILE_DEPS,
  srcs = glob(['target/generated-sources/**', 'src/main/**']),
)

onos_app(
  title = 'YMS Test App',
  category = 'Test',
  url = 'http://onosproject.org',
  description = 'YMS test application.',
  included_bundles = BUNDLES,
)
