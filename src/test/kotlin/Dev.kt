import org.testcontainers.containers.localstack.LocalStackContainer
import org.testcontainers.utility.DockerImageName

//import aws.sdk.kotlin.hll.dynamodbmapper.generatedschemas.CarSchema


fun main() {
//    val localstackImage = DockerImageName.parse("localstack/localstack:3.5.0")
//
//    LocalStackContainer(localstackImage)
//        .withServices(LocalStackContainer.Service.DYNAMODB)
//        .use { localStack ->
//            localStack.start()
//
//            println(localStack.endpoint)
//            println(localStack.region)
//
////            val client = DynamoDbClient.fromEnvironment()
////            val mapper = DynamoDbMapper(client)
//
//
//        }


    server.start(wait = true)
}