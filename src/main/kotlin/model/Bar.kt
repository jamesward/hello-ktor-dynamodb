package model

import aws.sdk.kotlin.hll.dynamodbmapper.DynamoDbItem
import aws.sdk.kotlin.hll.dynamodbmapper.DynamoDbPartitionKey
import kotlinx.serialization.Serializable

@DynamoDbItem
@Serializable
data class Bar(

    @DynamoDbPartitionKey
    val id: Int,

    val name: String,
)
