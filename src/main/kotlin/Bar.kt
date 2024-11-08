import aws.sdk.kotlin.hll.dynamodbmapper.DynamoDbItem
import aws.sdk.kotlin.hll.dynamodbmapper.DynamoDbPartitionKey
import kotlinx.serialization.Serializable

@DynamoDbItem
@Serializable
data class Bar(

    @DynamoDbPartitionKey
    val id: Int? = null,

    val name: String,
)
