package com.southwind.mongoDBtest;

import com.mongodb.client.*;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @FileName：test
 * @Author：LiYan
 * @createDate：2023/1/11 16:41
 * @description：
 */
public class test {
    public static void main(String[] args) {
        MongoClient mongoClient = MongoClients.create();

        // 连接数据库
        MongoDatabase database = mongoClient.getDatabase("mydb");
        MongoCollection<Document> collection = database.getCollection("test");

        Document doc = new Document()
                .append("id", 1)
                .append("name", "沉默王二")
                .append("age", "18")
                .append("sex", "男")
                .append("hobbies", Arrays.asList("写作", "敲代码"));
        Document doc1 = new Document()
                .append("id", 1)
                .append("name", "沉默王二")
                .append("age", "19")
                .append("sex", "女")
                .append("hobbies", Arrays.asList("写作", "敲代码"));
        Document doc2 = new Document()
                .append("id", 1)
                .append("name", "沉默王二")
                .append("sex", "男")
                .append("hobbies", Arrays.asList("写作", "敲代码"));

        List<Document> documentList = new ArrayList<>();
        documentList.add(doc);
        documentList.add(doc1);
        documentList.add(doc2);
//        collection.insertOne(documentList);
        collection.insertMany(documentList);
//        collection.deleteOne(doc);
//        collection.deleteMany(new Document("age","20"));

        System.out.println("集合大小：" +collection.countDocuments());

//        Document myDoc = collection.find().first();
//        System.out.println("文档内容：" + myDoc.toJson());
        MongoCursor<Document> myDocs = collection.find().iterator();
        while (myDocs.hasNext()){
            System.out.println(myDocs.next().toJson());
        }
    }
}
