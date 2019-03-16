# vertx-cluster-example

Vertx

https://www.infoq.com/br/presentations/modern-app-programming-with-rxjava-and-eclipse-vertx

mvn io.reactiverse:vertx-maven-plugin:1.0.18:setup -DprojectGroupId=br.com.fazolli.vertx.client -DprojectArtifactId=client-vertx -DprojectVersion=1.0.0-snapshot -Dverticle=br.com.fazolli.vertx.client.ClientVertx -Ddependencies=infinispan

mvn io.reactiverse:vertx-maven-plugin:1.0.18:setup -DprojectGroupId=br.com.fazolli.vertx.server -DprojectArtifactId=server-vertx -DprojectVersion=1.0.0-snapshot -Dverticle=br.com.fazolli.vertx.server.ServerVertx -Ddependencies=web,infinispan


java -Djava.net.preferIPv4.Stack=true -jar target/server-vertx-1.0.0-snapshot.jar -cluster
