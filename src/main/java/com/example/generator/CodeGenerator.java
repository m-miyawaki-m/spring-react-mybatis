package com.example.generator;

import java.util.Collections;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DateType;

public class CodeGenerator {

    private static final String URL = "jdbc:oracle:thin:@//192.168.3.9:1521/orclpdb1";
    private static final String USERNAME = "hr";
    private static final String PASSWORD = "hr";
    private static final String PACKAGE_NAME = "com.example";
    private static final String OUTPUT_DIR = System.getProperty("user.dir") + "/src/main/java";

    public static void main(String[] args) {
        FastAutoGenerator.create(URL, USERNAME, PASSWORD)
                .globalConfig(builder -> {
                    builder.author("m-miyawaki") // 作成者
                            .enableSwagger() // Swagger アノテーションを有効化
                            .dateType(DateType.TIME_PACK) // Java 8/11 の日付型を使用
                            .commentDate("yyyy-MM-dd") // コメントの日付フォーマット
                            .outputDir(OUTPUT_DIR); // 出力ディレクトリ
                })
                .packageConfig(builder -> {
                    builder.parent(PACKAGE_NAME) // ベースパッケージ
                            .entity("entity") // エンティティのパッケージ
                            .mapper("mapper") // マッパーのパッケージ
                            .service("service") // サービスのパッケージ
                            .serviceImpl("service.impl") // サービス実装のパッケージ
                            .controller("controller") // コントローラーのパッケージ
                            .pathInfo(Collections.singletonMap(OutputFile.xml,
                                    System.getProperty("user.dir") + "/src/main/resources/mapper"));
                })
                .strategyConfig(builder -> {
                    builder.addInclude("EMPLOYEES") // 生成対象のテーブル（Oracle の HR スキーマにある EMPLOYEES）
                            .addTablePrefix("T_") // プレフィックスを削除
                            .entityBuilder().enableLombok(); // Lombok を有効化
                })
                .execute();
    }
}
