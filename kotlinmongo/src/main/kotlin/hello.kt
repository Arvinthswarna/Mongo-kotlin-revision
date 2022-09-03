import com.mongodb.MongoClient
import com.mongodb.MongoException
import com.mongodb.BasicDBObject

fun main(args: Array<String>) {
    var mongoClient:MongoClient?=null   //Elvis Operator ?
    try {
        mongoClient = MongoClient("127.0.0.1",27017)
        println("Connected to MongoDB ")

    //Read query

        var db = mongoClient.getDatabase("movie")
//        var col = db.getCollection("movies")
//        var cursur = col.find().limit(5)
//        var it = cursur.iterator()
//        while(it.hasNext()){
//            println(it.next())
//        }
//        //insert query
//        var col1 = db.getCollection("user")
//        var document = BasicDBObject()
//
//        document.put("fname","sri")
//        document.put("lname", "L")
//        col1.insert(document)
//
//        var cursur1 = col1.find().limit(2)
//        var it1 = cursur1.iterator()
//        while(it1.hasNext()){
//            println(it1.next())
//        }
        //delete query
        var col2 =db.getCollection("user")
        var document2 = BasicDBObject()
        document2.put("fname","sri")
        col2.deleteOne(Document(document2))
        var cursor2 = col2.find(Document("delete successful"))
        var it2 = cursor2.iterator()

    }catch(e:MongoException){
        e.printStackTrace() //it will show what the exception is
    }finally{
        mongoClient?.close()
    }
    println("Hello World")
}



