package jsonlab.jackson;

public class TestRun {
    String result1 = "{\n" +
            "  \"totalCount\": 1,\n" +
            "  \"pages\": 1,\n" +
            "  \"pageSize\": 3,\n" +
            "  \"currentPage\": 1,\n" +
            "  \"productList\": [\n" +
            "    {\n" +
            "      \"itemNo\": \"0001.Y0005.503\",\n" +
            "      \"vModelNo\": \"CFQ7TTC0LGTX1YA \",\n" +
            "      \"desc\": \"Windows 10/11 Enterprise E3;0004;商業;P1Y;Annual;CFQ7TTC0LGTX;年付;\",\n" +
            "      \"specList\": [\n" +
            "        {\n" +
            "          \"seq\": 1,\n" +
            "          \"specName\": \"產品名稱\",\n" +
            "          \"specValue\": \"Windows 10/11 Enterprise E3\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 2,\n" +
            "          \"specName\": \"SKU ID\",\n" +
            "          \"specValue\": \"0004\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 3,\n" +
            "          \"specName\": \"資格\",\n" +
            "          \"specValue\": \"商業\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 4,\n" +
            "          \"specName\": \"TermDuration\",\n" +
            "          \"specValue\": \"P1Y\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 5,\n" +
            "          \"specName\": \"BillingPlan\",\n" +
            "          \"specValue\": \"Annual\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 6,\n" +
            "          \"specName\": \"ProductId\",\n" +
            "          \"specValue\": \"CFQ7TTC0LGTX\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 7,\n" +
            "          \"specName\": \"Purchase Unit (期間)\",\n" +
            "          \"specValue\": \"年付\"\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "  ]\n" +
            "}";
    String result2 = "{\n" +
            "  \"totalCount\": 7,\n" +
            "  \"pages\": 1,\n" +
            "  \"pageSize\": 100,\n" +
            "  \"currentPage\": 1,\n" +
            "  \"productList\": [\n" +
            "    {\n" +
            "      \"itemNo\": \"0001.Y0001.503\",\n" +
            "      \"vModelNo\": \"CFQ7TTC0LF8Q1YA \",\n" +
            "      \"desc\": \"Office 365 E1;0001;商業;P1Y;Annual;CFQ7TTC0LF8Q;年付;\",\n" +
            "      \"specList\": [\n" +
            "        {\n" +
            "          \"seq\": 1,\n" +
            "          \"specName\": \"產品名稱\",\n" +
            "          \"specValue\": \"Office 365 E1\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 2,\n" +
            "          \"specName\": \"SKU ID\",\n" +
            "          \"specValue\": \"0001\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 3,\n" +
            "          \"specName\": \"資格\",\n" +
            "          \"specValue\": \"商業\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 4,\n" +
            "          \"specName\": \"TermDuration\",\n" +
            "          \"specValue\": \"P1Y\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 5,\n" +
            "          \"specName\": \"BillingPlan\",\n" +
            "          \"specValue\": \"Annual\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 6,\n" +
            "          \"specName\": \"ProductId\",\n" +
            "          \"specValue\": \"CFQ7TTC0LF8Q\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 7,\n" +
            "          \"specName\": \"Purchase Unit (期間)\",\n" +
            "          \"specValue\": \"年付\"\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "    {\n" +
            "      \"itemNo\": \"0001.Y0002.503\",\n" +
            "      \"vModelNo\": \"CFQ7TTC0LF8R1YA \",\n" +
            "      \"desc\": \"Office 365 E3;0001;商業;P1Y;Annual;CFQ7TTC0LF8R;年付;\",\n" +
            "      \"specList\": [\n" +
            "        {\n" +
            "          \"seq\": 1,\n" +
            "          \"specName\": \"產品名稱\",\n" +
            "          \"specValue\": \"Office 365 E3\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 2,\n" +
            "          \"specName\": \"SKU ID\",\n" +
            "          \"specValue\": \"0001\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 3,\n" +
            "          \"specName\": \"資格\",\n" +
            "          \"specValue\": \"商業\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 4,\n" +
            "          \"specName\": \"TermDuration\",\n" +
            "          \"specValue\": \"P1Y\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 5,\n" +
            "          \"specName\": \"BillingPlan\",\n" +
            "          \"specValue\": \"Annual\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 6,\n" +
            "          \"specName\": \"ProductId\",\n" +
            "          \"specValue\": \"CFQ7TTC0LF8R\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 7,\n" +
            "          \"specName\": \"Purchase Unit (期間)\",\n" +
            "          \"specValue\": \"年付\"\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "    {\n" +
            "      \"itemNo\": \"0001.Y0003.503\",\n" +
            "      \"vModelNo\": \"CFQ7TTC0LF8S1YA \",\n" +
            "      \"desc\": \"Office 365 E5;0002;商業;P1Y;Annual;CFQ7TTC0LF8S;年付;\",\n" +
            "      \"specList\": [\n" +
            "        {\n" +
            "          \"seq\": 1,\n" +
            "          \"specName\": \"產品名稱\",\n" +
            "          \"specValue\": \"Office 365 E5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 2,\n" +
            "          \"specName\": \"SKU ID\",\n" +
            "          \"specValue\": \"0002\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 3,\n" +
            "          \"specName\": \"資格\",\n" +
            "          \"specValue\": \"商業\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 4,\n" +
            "          \"specName\": \"TermDuration\",\n" +
            "          \"specValue\": \"P1Y\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 5,\n" +
            "          \"specName\": \"BillingPlan\",\n" +
            "          \"specValue\": \"Annual\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 6,\n" +
            "          \"specName\": \"ProductId\",\n" +
            "          \"specValue\": \"CFQ7TTC0LF8S\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 7,\n" +
            "          \"specName\": \"Purchase Unit (期間)\",\n" +
            "          \"specValue\": \"年付\"\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "    {\n" +
            "      \"itemNo\": \"0001.Y0004.503\",\n" +
            "      \"vModelNo\": \"CFQ7TTC0LGZW1YA \",\n" +
            "      \"desc\": \"Office 365 F3;0001;商業;P1Y;Annual;CFQ7TTC0LGZW;年付;\",\n" +
            "      \"specList\": [\n" +
            "        {\n" +
            "          \"seq\": 1,\n" +
            "          \"specName\": \"產品名稱\",\n" +
            "          \"specValue\": \"Office 365 F3\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 2,\n" +
            "          \"specName\": \"SKU ID\",\n" +
            "          \"specValue\": \"0001\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 3,\n" +
            "          \"specName\": \"資格\",\n" +
            "          \"specValue\": \"商業\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 4,\n" +
            "          \"specName\": \"TermDuration\",\n" +
            "          \"specValue\": \"P1Y\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 5,\n" +
            "          \"specName\": \"BillingPlan\",\n" +
            "          \"specValue\": \"Annual\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 6,\n" +
            "          \"specName\": \"ProductId\",\n" +
            "          \"specValue\": \"CFQ7TTC0LGZW\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 7,\n" +
            "          \"specName\": \"Purchase Unit (期間)\",\n" +
            "          \"specValue\": \"年付\"\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "    {\n" +
            "      \"itemNo\": \"0001.Y0005.503\",\n" +
            "      \"vModelNo\": \"CFQ7TTC0LGTX1YA \",\n" +
            "      \"desc\": \"Windows 10/11 Enterprise E3;0004;商業;P1Y;Annual;CFQ7TTC0LGTX;年付;\",\n" +
            "      \"specList\": [\n" +
            "        {\n" +
            "          \"seq\": 1,\n" +
            "          \"specName\": \"產品名稱\",\n" +
            "          \"specValue\": \"Windows 10/11 Enterprise E3\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 2,\n" +
            "          \"specName\": \"SKU ID\",\n" +
            "          \"specValue\": \"0004\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 3,\n" +
            "          \"specName\": \"資格\",\n" +
            "          \"specValue\": \"商業\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 4,\n" +
            "          \"specName\": \"TermDuration\",\n" +
            "          \"specValue\": \"P1Y\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 5,\n" +
            "          \"specName\": \"BillingPlan\",\n" +
            "          \"specValue\": \"Annual\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 6,\n" +
            "          \"specName\": \"ProductId\",\n" +
            "          \"specValue\": \"CFQ7TTC0LGTX\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 7,\n" +
            "          \"specName\": \"Purchase Unit (期間)\",\n" +
            "          \"specValue\": \"年付\"\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "    {\n" +
            "      \"itemNo\": \"0001.Y0006.503\",\n" +
            "      \"vModelNo\": \"CFQ7TTC0LGTX1YAV\",\n" +
            "      \"desc\": \"Windows 10/11 Enterprise E3 VDA;0001;商業;P1Y;Annual;CFQ7TTC0LGTX;年付;\",\n" +
            "      \"specList\": [\n" +
            "        {\n" +
            "          \"seq\": 1,\n" +
            "          \"specName\": \"產品名稱\",\n" +
            "          \"specValue\": \"Windows 10/11 Enterprise E3 VDA\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 2,\n" +
            "          \"specName\": \"SKU ID\",\n" +
            "          \"specValue\": \"0001\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 3,\n" +
            "          \"specName\": \"資格\",\n" +
            "          \"specValue\": \"商業\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 4,\n" +
            "          \"specName\": \"TermDuration\",\n" +
            "          \"specValue\": \"P1Y\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 5,\n" +
            "          \"specName\": \"BillingPlan\",\n" +
            "          \"specValue\": \"Annual\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 6,\n" +
            "          \"specName\": \"ProductId\",\n" +
            "          \"specValue\": \"CFQ7TTC0LGTX\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 7,\n" +
            "          \"specName\": \"Purchase Unit (期間)\",\n" +
            "          \"specValue\": \"年付\"\n" +
            "        }\n" +
            "      ]\n" +
            "    },\n" +
            "    {\n" +
            "      \"itemNo\": \"0001.Y0007.503\",\n" +
            "      \"vModelNo\": \"CFQ7TTC0LFNW1YA \",\n" +
            "      \"desc\": \"Windows 10/11 Enterprise E5;0002;商業;P1Y;Annual;CFQ7TTC0LFNW;年付;\",\n" +
            "      \"specList\": [\n" +
            "        {\n" +
            "          \"seq\": 1,\n" +
            "          \"specName\": \"產品名稱\",\n" +
            "          \"specValue\": \"Windows 10/11 Enterprise E5\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 2,\n" +
            "          \"specName\": \"SKU ID\",\n" +
            "          \"specValue\": \"0002\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 3,\n" +
            "          \"specName\": \"資格\",\n" +
            "          \"specValue\": \"商業\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 4,\n" +
            "          \"specName\": \"TermDuration\",\n" +
            "          \"specValue\": \"P1Y\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 5,\n" +
            "          \"specName\": \"BillingPlan\",\n" +
            "          \"specValue\": \"Annual\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 6,\n" +
            "          \"specName\": \"ProductId\",\n" +
            "          \"specValue\": \"CFQ7TTC0LFNW\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"seq\": 7,\n" +
            "          \"specName\": \"Purchase Unit (期間)\",\n" +
            "          \"specValue\": \"年付\"\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "  ]\n" +
            "}";
}
