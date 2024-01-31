package com.counterapp.testData;

public abstract class TestData {

    protected String regularStringInput = "aaaaBBBccddE";
    protected String regularStringExpected = "\"a\": 4, \"B\": 3, \"c\": 2, \"d\": 2, \"E\": 1";

    protected String symbolsStringInput = "@@^^^^//\\\\.....&&&[[[]]](((";
    protected String symbolsStringExpected = "\".\": 5, \"^\": 4, \"&\": 3, \"(\": 3, \"[\": 3, \"]\": 3, \"@\": 2, \"\\\": 2, \"/\": 2";

    protected String whitespaceStringInput = "aaa bb c";
    protected String whitespaceStringExpected = "\"a\": 3, \" \": 2, \"b\": 2, \"c\": 1";

    protected String emptyStringInput = "";

    protected String linebreakStringInput = "aaa\n" +
                                            "bb\n" +
                                            "c";
    protected String linebreakStringExpected = "\"a\": 3, \"b\": 2, \"\n" +
            "\": 2, \"c\": 1";

    protected String longMultilangStringInput = "Java[прим. 1] — строго типизированный объектно-ориентированный язык программирования общего назначения, разработанный компанией Sun Microsystems (в последующем приобретённой компанией Oracle). Разработка ведётся сообществом, организованным через Java Community Process; язык и основные реализующие его технологии распространяются по лицензии GPL. Права на торговую марку принадлежат корпорации Oracle.\n" +
            "\n" +
            "Приложения Java обычно транслируются в специальный байт-код, поэтому они могут работать на любой компьютерной архитектуре, для которой существует реализация виртуальной Java-машины. Дата официального выпуска — 23 мая 1995 года. Занимает высокие места в рейтингах популярности языков программирования (2-е место в рейтингах IEEE Spectrum (2020)[3] и TIOBE (2021)[4]).\n" +
            "\n" +
            "Изначально язык назывался Oak («Дуб»), разрабатывался Джеймсом Гослингом для программирования бытовых электронных устройств. Из-за того, что язык с таким названием уже существовал, Oak был переименован в Java[5]. Назван в честь марки кофе Java, которая, в свою очередь, получила наименование одноимённого острова (Ява), поэтому на официальной эмблеме языка изображена чашка с горячим кофе. Существует и другая версия происхождения названия языка, связанная с аллюзией на кофемашину как пример бытового устройства, для программирования которого изначально язык создавался. В соответствии с этимологией в русскоязычной литературе с конца двадцатого и до первых лет двадцать первого века название языка нередко переводилось как Ява, а не транскрибировалось.\n" +
            "\n" +
            "В результате работы проекта мир увидел принципиально новое устройство, карманный персональный компьютер Star7[6], который опередил своё время более чем на 10 лет, но из-за большой стоимости в 50 долларов не смог произвести переворот в мире технологии и был забыт.\n" +
            "\n" +
            "Устройство Star7 не пользовалось популярностью, в отличие от языка программирования Java и его окружения. Следующим этапом жизни языка стала разработка интерактивного телевидения. В 1994 году стало очевидным, что интерактивное телевидение было ошибкой.\n" +
            "\n" +
            "С середины 1990-х годов язык стал широко использоваться для написания клиентских приложений и серверного программного обеспечения. Тогда же определённое распространение получила технология Java-апплетов — графических Java-приложений, встраиваемых в веб-страницы; с развитием возможностей динамических веб-страниц в 2000-е годы технология стала применяться редко.\n" +
            "\n" +
            "В веб-разработке применяется Spring Framework; для документирования используется утилита Javadoc.\n" +
            "\n" +
            "Программы на Java транслируются в байт-код Java, выполняемый виртуальной машиной Java (JVM) — программой, обрабатывающей байтовый код и передающей инструкции оборудованию как интерпретатор.\n" +
            "\n" +
            "Достоинством подобного способа выполнения программ является полная независимость байт-кода от операционной системы и оборудования, что позволяет выполнять Java-приложения на любом устройстве, для которого существует соответствующая виртуальная машина. Другой важной особенностью технологии Java является гибкая система безопасности, в рамках которой исполнение программы полностью контролируется виртуальной машиной. Любые операции, которые превышают установленные полномочия программы (например, попытка несанкционированного доступа к данным или соединения с другим компьютером), вызывают немедленное прерывание.\n" +
            "\n" +
            "Часто к недостаткам концепции виртуальной машины относят снижение производительности. Ряд усовершенствований несколько увеличил скорость выполнения программ на Java:\n" +
            "\n" +
            "применение технологии трансляции байт-кода в машинный код непосредственно во время работы программы (JIT-технология) с возможностью сохранения версий класса в машинном коде,\n" +
            "обширное использование платформенно-ориентированного кода (native-код) в стандартных библиотеках,\n" +
            "аппаратные средства, обеспечивающие ускоренную обработку байт-кода (например, технология Jazelle, поддерживаемая некоторыми процессорами архитектуры ARM).\n" +
            "По данным сайта shootout.alioth.debian.org, для семи разных задач время выполнения на Java составляет в среднем в полтора-два раза больше, чем для C/C++, в некоторых случаях Java быстрее, а в отдельных случаях в 7 раз медленнее[7]. С другой стороны, для большинства из них потребление памяти Java-машиной было в 10—30 раз больше, чем программой на C/C++. Также примечательно исследование, проведённое компанией Google, согласно которому отмечается существенно более низкая производительность и бо́льшее потребление памяти в тестовых примерах на Java в сравнении с аналогичными программами на C++[8][9][10].\n" +
            "\n" +
            "Идеи, заложенные в концепцию и различные реализации среды виртуальной машины Java, вдохновили множество энтузиастов на расширение перечня языков, которые могли бы быть использованы для создания программ, исполняемых на виртуальной машине[11]. Эти идеи нашли также выражение в спецификации общеязыковой инфраструктуры CLI, заложенной в основу платформы .NET компанией Microsoft.\n" +
            "\n" +
            "Спецификация Java 5.0 была выпущена 30 сентября 2004 года, кодовое имя — Tiger. C этой версии изменена официальная индексация, вместо Java 1.5 правильнее называть Java 5.0. Внутренняя же индексация Sun осталась прежней — 1.x. Малые изменения теперь включаются без изменения индексации, для этого используется слово «Update» или буква «u», например, Java Development Kit 5.0 Update 22. Предполагается, что в обновления могут входить как исправления ошибок, так и небольшие добавления в API, JVM.\n" +
            "\n" +
            "В данной версии разработчики внесли в язык целый ряд принципиальных дополнений:\n" +
            "\n" +
            "Перечислимые типы (англ. enum). Ранее отсутствовавшие в Java типы оформлены по аналогии с C++, но при этом имеют ряд дополнительных возможностей.\n" +
            "Перечислимый тип является полноценным классом Java, то есть может иметь конструктор, поля, методы, в том числе — скрытые и абстрактные.\n" +
            "Перечисление может реализовывать интерфейсы.\n" +
            "Для перечислений имеются встроенные методы, дающие возможность получения значений типа по имени, символьных значений, соответствующих именам, преобразования между номером и значением, проверки типа на то, что он является перечислимым.\n" +
            "Аннотации — возможность добавления в текст программы метаданных, непосредственно не влияющих на выполнение кода, но допускающих использование для получения различных сведений о коде и его исполнении. Одновременно выпущен инструментарий для использования аннотированного кода. Одно из применений аннотаций — упрощение создания тестовых модулей для Java-кода.\n" +
            "Средства обобщённого программирования (англ. generics) — механизм, аналогичный средствам языков Ada[14] и Eiffel (позже также появились и в C#, принципиально отличаются от шаблонов C++), дающий возможность создавать классы и методы с полями и параметрами произвольного объектного типа. С использованием данного механизма реализованы новые версии коллекций стандартной библиотеки Java.\n" +
            "Методы с неопределённым числом параметров.\n" +
            "Autoboxing/Unboxing — автоматическое преобразование между скалярными типами Java и соответствующими типами-обёртками (например, между int — Integer). Наличие такой возможности сокращает код, поскольку исключает необходимость выполнения явных преобразований типов в очевидных случаях.\n" +
            "Разрешён импорт статических полей и методов.\n" +
            "В язык введён цикл по коллекции объектов (итератор, англ. foreach).\n" +
            "Введено использование Javadoc-комментариев, которые используются для автоматического оформления документации по комментариям в исходном коде.\n" +
            "\n" +
            "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run anywhere (WORA),[16] meaning that compiled Java code can run on all platforms that support Java without the need to recompile.[17] Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code modification) that are typically not available in traditional compiled languages.\n" +
            "\n" +
            "Java gained popularity shortly after its release, and has been a very popular programming language since then.[18] Java was the third most popular programming language in 2022 according to GitHub[19] and it is ranked fourth on TIOBE index as of October 2023.[20] Although still widely popular, there has been a gradual decline in use of Java in recent years with other languages using JVM gaining popularity.[21]\n" +
            "\n" +
            "Java was originally developed by James Gosling at Sun Microsystems. It was released in May 1995 as a core component of Sun's Java platform. The original and reference implementation Java compilers, virtual machines, and class libraries were originally released by Sun under proprietary licenses. As of May 2007, in compliance with the specifications of the Java Community Process, Sun had relicensed most of its Java technologies under the GPL-2.0-only license. Oracle offers its own HotSpot Java Virtual Machine, however the official reference implementation is the OpenJDK JVM which is free open-source software and used by most developers and is the default JVM for almost all Linux distributions.\n" +
            "\n" +
            "As of September 2023, Java 21 is the latest version, which is also a long-term support (LTS) version. Java 8, 11, and 17 are previous LTS versions still officially supported.\n" +
            "\n" +
            "James Gosling, Mike Sheridan, and Patrick Naughton initiated the Java language project in June 1991.[22] Java was originally designed for interactive television, but it was too advanced for the digital cable television industry at the time.[23] The language was initially called Oak after an oak tree that stood outside Gosling's office. Later the project went by the name Green and was finally renamed Java, from Java coffee, a type of coffee from Indonesia.[24] Gosling designed Java with a C/C++-style syntax that system and application programmers would find familiar.[25]\n" +
            "\n" +
            "Sun Microsystems released the first public implementation as Java 1.0 in 1996.[26] It promised write once, run anywhere (WORA) functionality, providing no-cost run-times on popular platforms. Fairly secure and featuring configurable security, it allowed network- and file-access restrictions. Major web browsers soon incorporated the ability to run Java applets within web pages, and Java quickly became popular. The Java 1.0 compiler was re-written in Java by Arthur van Hoff to comply strictly with the Java 1.0 language specification.[27] With the advent of Java 2 (released initially as J2SE 1.2 in December 1998 – 1999), new versions had multiple configurations built for different types of platforms. J2EE included technologies and APIs for enterprise applications typically run in server environments, while J2ME featured APIs optimized for mobile applications. The desktop version was renamed J2SE. In 2006, for marketing purposes, Sun renamed new J2 versions as Java EE, Java ME, and Java SE, respectively.\n" +
            "\n" +
            "In 1997, Sun Microsystems approached the ISO/IEC JTC 1 standards body and later the Ecma International to formalize Java, but it soon withdrew from the process.[28][29][30] Java remains a de facto standard, controlled through the Java Community Process.[31] At one time, Sun made most of its Java implementations available without charge, despite their proprietary software status. Sun generated revenue from Java through the selling of licenses for specialized products such as the Java Enterprise System.\n" +
            "\n" +
            "On November 13, 2006, Sun released much of its Java virtual machine (JVM) as free and open-source software (FOSS), under the terms of the GPL-2.0-only license. On May 8, 2007, Sun finished the process, making all of its JVM's core code available under free software/open-source distribution terms, aside from a small portion of code to which Sun did not hold the copyright.[32]\n" +
            "\n" +
            "Sun's vice-president Rich Green said that Sun's ideal role with regard to Java was as an evangelist.[33] Following Oracle Corporation's acquisition of Sun Microsystems in 2009–10, Oracle has described itself as the steward of Java technology with a relentless commitment to fostering a community of participation and transparency.[34] This did not prevent Oracle from filing a lawsuit against Google shortly after that for using Java inside the Android SDK (see the Android section).\n" +
            "\n" +
            "On April 2, 2010, James Gosling resigned from Oracle.[35]\n" +
            "\n" +
            "In January 2016, Oracle announced that Java run-time environments based on JDK 9 will discontinue the browser plugin.[36]\n" +
            "\n" +
            "Java software runs on everything from laptops to data centers, game consoles to scientific supercomputers.[37]\n" +
            "\n" +
            "Oracle (and others) highly recommend uninstalling outdated and unsupported versions of Java, due to unresolved security issues in older versions.[38]\n" +
            "\n" +
            "James Gosling, Mike Sheridan, and Patrick Naughton initiated the Java language project in June 1991.[22] Java was originally designed for interactive television, but it was too advanced for the digital cable television industry at the time.[23] The language was initially called Oak after an oak tree that stood outside Gosling's office. Later the project went by the name Green and was finally renamed Java, from Java coffee, a type of coffee from Indonesia.[24] Gosling designed Java with a C/C++-style syntax that system and application programmers would find familiar.[25]\n" +
            "\n" +
            "Sun Microsystems released the first public implementation as Java 1.0 in 1996.[26] It promised write once, run anywhere (WORA) functionality, providing no-cost run-times on popular platforms. Fairly secure and featuring configurable security, it allowed network- and file-access restrictions. Major web browsers soon incorporated the ability to run Java applets within web pages, and Java quickly became popular. The Java 1.0 compiler was re-written in Java by Arthur van Hoff to comply strictly with the Java 1.0 language specification.[27] With the advent of Java 2 (released initially as J2SE 1.2 in December 1998 – 1999), new versions had multiple configurations built for different types of platforms. J2EE included technologies and APIs for enterprise applications typically run in server environments, while J2ME featured APIs optimized for mobile applications. The desktop version was renamed J2SE. In 2006, for marketing purposes, Sun renamed new J2 versions as Java EE, Java ME, and Java SE, respectively.\n" +
            "\n" +
            "In 1997, Sun Microsystems approached the ISO/IEC JTC 1 standards body and later the Ecma International to formalize Java, but it soon withdrew from the process.[28][29][30] Java remains a de facto standard, controlled through the Java Community Process.[31] At one time, Sun made most of its Java implementations available without charge, despite their proprietary software status. Sun generated revenue from Java through the selling of licenses for specialized products such as the Java Enterprise System.\n" +
            "\n" +
            "On November 13, 2006, Sun released much of its Java virtual machine (JVM) as free and open-source software (FOSS), under the terms of the GPL-2.0-only license. On May 8, 2007, Sun finished the process, making all of its JVM's core code available under free software/open-source distribution terms, aside from a small portion of code to which Sun did not hold the copyright.[32]\n" +
            "\n" +
            "Sun's vice-president Rich Green said that Sun's ideal role with regard to Java was as an evangelist.[33] Following Oracle Corporation's acquisition of Sun Microsystems in 2009–10, Oracle has described itself as the steward of Java technology with a relentless commitment to fostering a community of participation and transparency.[34] This did not prevent Oracle from filing a lawsuit against Google shortly after that for using Java inside the Android SDK (see the Android section).\n" +
            "\n" +
            "On April 2, 2010, James Gosling resigned from Oracle.[35]\n" +
            "\n" +
            "In January 2016, Oracle announced that Java run-time environments based on JDK 9 will discontinue the browser plugin.[36]\n" +
            "\n" +
            "Java software runs on everything from laptops to data centers, game consoles to scientific supercomputers.[37]\n" +
            "\n" +
            "Oracle (and others) highly recommend uninstalling outdated and unsupported versions of Java, due to unresolved security issues in older versions.[38]\n" +
            "\n" +
            "\"જાવા\" એક કમ્પ્યૂટર પ્રોગ્રામિંગ ભાષા છે. જેની શોધ જેમ્સ ગોઝ્લિંગે ઇ.સ. ૧૯૯૫માં કરી. જાવા સન માઇક્રોસિસ્ટમ્સ દ્વારા વિકસાવવામાં આવેલ છે.આ ભાષાના મોટા ભાગની વાક્યરચના C અને C++ મુજબ અનુસરવામાં છે. જાવા એપ્લિકેશન્સનું \"બાઇટ-કોડ\"માં સંકલન થાય છે જે કોઇ પણ JVM પર ચલાવી શકાય છે. જાવા એક મલ્ટી પેરાડિગમ, ક્લાસ આધારિત, સમવર્તી, ઓબ્જેકટ ઓરિએન્ટેડ પ્રોગ્રામિંગ ભાષા છે.જાવા પોર્ટેબલ-એટલે કે કોડ એક વાર લખીને કોઇ પણ પ્લેટફોર્મ પર જેમાં JVM સ્થાપિત હોય ચલાવી શકાય છે.\n" +
            "\n" +
            "જાવા c પછી દુનિયાની બીજા નંબરની સૌથી વધારે પ્રખ્યાત અને વધુમાં વધુ વપરાતી ભાષા છે.જાવા ત્રણ પ્લેટફોર્મ માં વિભાજીત છે ૧. J2ME (જે મોબાઈલ માં એપલીકેશન બનાવવા માટે વપરાય છે ) ૨. J2SE (જે ડેસ્કટોપ એપ્લીકેશન બનાવવા માટે વપરાય છે) ૩. J2EE (જે વેબસાઈટ બનાવવા માટે વપરાય છે)\n" +
            "\n" +
            "James Gosling, Mike Sheridan, এবং Patrick Naughton ১৯৯১ সালের জুনে জাভা ল্যাঙ্গুয়েজ প্রোজেক্ট শুরু করেন। প্রাথমিকদিকে জাভা ল্যাঙ্গুয়েজকে \"ওক\"(Oak) বলা হত। জেমস গসলিং এর অফিসের বাহিরের ওক গাছের সাথে মিল রেখে এই নাম রাখা হয়। এরপর এর নাম রাখা হয় \"গ্রীন\"। তারপর একদিন তাঁরা একটি কফিশপে বসে আড্ডা দিচ্ছিলেন, ঐ তখনই কফির কাপটি দেখে ধোঁয়াতোলা কফির কাপের সাথে মিল রেখে লোগো তৈরি এবং এর নাম পরিবর্তন করে \"জাভা\" নামকরণের পরিকল্পনা করলেন। ১৯৯৫ সালে সান মাইক্রোসিস্টেমস জাভা-১.০ প্রকাশ করেন। তাদের মূলনীতি ছিল \"একবার লিখুন, যে কোনো জায়গায় চালান (Write Once, Run Anywhere or WORA)\"। জাভার উল্লেখযোগ্য সংস্করণের মধ্যে অন্যতম হল -\n" +
            "\n" +
            "জেডিকে ১.০ (জানুয়ারী ২১, ১৯৯৬)\n" +
            "জেডিকে ১.১ (ফেব্রুয়ারি ১৯, ১৯৯৭)\n" +
            "জে২এসই ১.২ (ডিসেম্বর ৮, ১৯৯৮)\n" +
            "জে২এসই ১.৩ (মে ৮, ২০০০)\n" +
            "জে২এসই ১.৪ (ফেব্রুয়ারি ৬, ২০০২)\n" +
            "জে২এসই ৫.০ (সেপ্টেম্বর ৩০, ২০০৪)\n" +
            "জাভা এসই ৬ (ডিসেম্বর ১১, ২০০৬)\n" +
            "জাভা এসই ৭ (জুলাই ২৮, ২০১১)\n" +
            "জাভা এসই ৮ (মার্চ ১৮, ২০১৪)\n" +
            "জাভা এসই ৯ (সেপ্টেম্বর ২১,২০১৭)\n" +
            "জাভা এসই ১০ (মার্চ ২০,২০১৮)\n" +
            "জাভা এসই ১১ (সেপ্টেম্বর ২৫,২০১৮)[৪]\n" +
            "জাভা এসই ১২ (মার্চ ১৯, ২০১৯)\n" +
            "জাভা এসই ১৩ (মার্চ ১৭, ২০১৯)\n" +
            "জাভা এসই ১৪ (মার্চ ১৭, ২০২০)\n" +
            "\n" +
            "Java是一種廣泛使用的電腦程式設計語言，擁有跨平台、物件導向、泛型程式設計的特性，广泛应用于企业级Web应用开发和移动应用开发。\n" +
            "\n" +
            "任職於昇陽電腦的詹姆斯·高斯林等人于1990年代初开发Java語言的雛形，最初被命名为Oak，目標設定在家用电器等小型系統的程式语言，應用在电视机、电话、闹钟、烤面包机等家用电器的控制和通訊。由于这些智能化家电的市场需求没有预期的高，昇陽電腦放弃了该项计划。随着1990年代網際網路的发展，昇陽電腦看見Oak在網際網路上应用的前景，于是改造了Oak，於1995年5月以Java的名称正式发布。Java伴随着互联网的迅猛发展而发展，逐渐成为重要的网络编程语言。\n" +
            "\n" +
            "Java编程语言的风格十分接近C++语言。继承了C++语言面向对象技术的核心，舍弃了容易引起错误的指標，以參照取代；移除了C++中的运算符重载和多重继承特性，用接口取代；增加垃圾回收器功能。在Java SE 1.5版本中引入了泛型编程、类型安全的枚举、不定长参数和自动装/拆箱特性。昇陽電腦对Java语言的解释是：「Java编程语言是个简单、面向对象、分布式、解释性、健壮、安全、与系统无关、可移植、高性能、多线程和动态的语言」。\n" +
            "\n" +
            "Java不同於一般的编译語言或直譯語言。它首先将源代码编译成字节码，再依赖各种不同平台上的虚拟机来解释执行字节码，从而具有“一次编写，到处运行”的跨平台特性。在早期JVM中，这在一定程度上降低了Java程序的运行效率。但在J2SE1.4.2发布后，Java的執行速度有了大幅提升。\n" +
            "\n" +
            "与传统型態不同，昇陽電腦在推出Java時就将其作为开放的技术。全球的Java开发公司被要求所设计的Java软件必须兼容。“Java语言靠群体的力量而非公司的力量”是昇陽電腦的口号之一，并获得了广大软件开发商的认同。这与微软公司所倡导的注重精英和封闭式的模式完全不同，此外，微软公司後來推出了与之竞争的.NET平台以及模仿Java的C#语言。後來昇陽電腦被甲骨文公司併購[14]，Java也隨之成為甲骨文公司的產品。\n" +
            "\n" +
            "目前，行動作業系統Android大部分的代碼採用Java程式設計語言編程。\n" +
            "\n" +
            "1994年6月，在同约翰·盖吉、詹姆斯·高斯林、比尔·乔伊、帕特里克·诺顿、韦恩·罗斯因和埃里克·施密特经历了一场历时三天的头脑风暴后，团队决定再一次改变努力的目标，这次他们决定将该技术应用于万维网。他们认为随着Mosaic浏览器的到来，因特网正在向同样的高度互动的远景演变，而这一远景正是他们在有线电视网中看到的。作为原型，帕特里克·诺顿写了一个小型万维网浏览器，WebRunner，后来改名为HotJava[15]。\n" +
            "\n" +
            "1994年10月，HotJava和Java平台为公司高层进行演示。1994年，Java 1.0a版本已经可以提供下載，但是Java和HotJava浏览器的第一次公开发布却是在1995年3月23日SunWorld大会上进行的。昇陽電腦的科学指导约翰·盖吉宣告Java技术。这个发布是与网景公司的执行副总裁马克·安德森的惊人发布一起进行的，宣布网景将在其浏览器中包含对Java的支持。1996年1月，昇陽電腦成立了Java业务集团，专门开发Java技术。\n" +
            "\n" +
            "在流行几年之后，Java在浏览器中的地位被逐步侵蚀。它在简单交互性动画方面的用途已经完全被Adobe公司的Flash排挤，2005年Java倾向只被用于雅虎游戏那样的更为复杂的应用程序。Java同时遭受到来自微软的反对，他们决定在新版本的Internet Explorer和Windows中不再附带Java平台。\n" +
            "\n" +
            "与此相反，在万维网的服务器端和手持设备上，Java变得更加流行。很多网站在後端使用JSP和其他的Java技术。\n" +
            "\n" +
            "在桌面系统上，独立的Java程序还是相对少见。这是因为Java平台的运行开销较大，而许多人的电脑上没有安装Java，由于网络带宽在以前较小，下载Java曾经是个耗时的事情。但是随着计算机计算能力、网络带宽在10年中取得了很大的进步，同时虚拟机和编译器的质量得到了提高，许多应用程序得到了广泛的使用，包括";
    protected String longMultilangStringExpected = "\" \": 2486, \"a\": 803, \"e\": 780, \"о\": 620, \"t\": 547, \"i\": 541, \"n\": 522, \"o\": 502, \"r\": 476, \"е\": 465, \"и\": 463, \"s\": 457, \"а\": 436, \"н\": 425, \"т\": 335, \"l\": 320, \"р\": 316, \"с\": 262, \"d\": 257, \"в\": 253, \"c\": 244, \"л\": 228, \"м\": 214, \"u\": 212, \"v\": 212, \"h\": 198, \"p\": 190, \"J\": 188, \"m\": 185, \"п\": 183, \",\": 181, \"f\": 170, \".\": 168, \"я\": 160, \"к\": 159, \"g\": 140, \"д\": 139, \"ы\": 139, \"\n" +
            "\": 129, \"y\": 113, \"з\": 110, \"w\": 97, \"у\": 94, \"б\": 89, \"й\": 87, \"г\": 83, \"2\": 79, \"ь\": 79, \"া\": 74, \"ા\": 74, \"1\": 71, \"b\": 69, \"的\": 67, \"0\": 66, \"-\": 63, \"ч\": 60, \"S\": 60, \"র\": 56, \"9\": 54, \"[\": 54, \"]\": 54, \"ে\": 54, \"х\": 53, \"(\": 52, \")\": 52, \"，\": 50, \"O\": 42, \"ц\": 41, \"ю\": 41, \"ે\": 41, \"E\": 39, \"M\": 39, \"ж\": 37, \"১\": 36, \"্\": 35, \"。\": 34, \"વ\": 33, \"3\": 32, \"C\": 32, \"স\": 32, \"્\": 31, \"I\": 30, \"ш\": 29, \"A\": 28, \"k\": 28, \"জ\": 28, \"ি\": 28, \"ર\": 28, \"щ\": 26, \"ক\": 26, \"২\": 25, \"મ\": 25, \"+\": 24, \"ম\": 24, \"০\": 24, \"এ\": 23, \"G\": 22, \"ક\": 22, \"ન\": 22, \"પ\": 22, \"在\": 22, \"、\": 21, \"T\": 21, \"ন\": 21, \"ল\": 21, \"5\": 18, \"જ\": 18, \"P\": 17, \"用\": 17, \"ই\": 17, \"য\": 17, \"ી\": 17, \"6\": 16, \"了\": 16, \"ટ\": 16, \"લ\": 16, \"સ\": 16, \"ો\": 16, \"7\": 15, \"ф\": 15, \"৯\": 15, \"言\": 15, \"程\": 15, \"V\": 14, \"প\": 14, \"ব\": 14, \"ভ\": 14, \"ં\": 14, \"发\": 14, \"—\": 13, \"4\": 13, \"和\": 13, \"是\": 13, \"છ\": 13, \"\"\": 12, \"行\": 12, \"િ\": 12, \"网\": 12, \"'\": 11, \"8\": 11, \"ё\": 11, \"W\": 11, \"一\": 11, \"年\": 11, \"બ\": 11, \"ય\": 11, \"/\": 10, \"L\": 10, \"э\": 10, \"·\": 10, \"腦\": 10, \"公\": 10, \"ত\": 10, \"়\": 10, \"ু\": 10, \"器\": 10, \"電\": 10, \"语\": 10, \"同\": 9, \"R\": 9, \"x\": 9, \"ো\": 9, \"昇\": 9, \"为\": 9, \"陽\": 9, \"开\": 9, \"司\": 9, \"В\": 8, \"П\": 8, \"D\": 8, \"F\": 8, \"খ\": 8, \"গ\": 8, \"৮\": 8, \"中\": 8, \"特\": 8, \"એ\": 8, \"ગ\": 8, \"式\": 8, \"编\": 8, \"С\": 7, \"性\": 7, \"H\": 7, \"N\": 7, \"j\": 7, \"z\": 7, \"电\": 7, \"।\": 7, \"চ\": 7, \"ট\": 7, \"布\": 7, \"上\": 7, \"平\": 7, \"于\": 7, \"应\": 7, \"ત\": 7, \"高\": 7, \"型\": 7, \"这\": 7, \"台\": 7, \"Д\": 6, \"K\": 6, \"被\": 6, \"大\": 6, \"ড\": 6, \"ফ\": 6, \"不\": 6, \"与\": 6, \"到\": 6, \"技\": 6, \"ભ\": 6, \"શ\": 6, \"ુ\": 6, \"代\": 6, \"有\": 6, \"术\": 6, \"定\": 6, \"对\": 6, \"而\": 5, \"向\": 5, \"泛\": 5, \"多\": 5, \"浏\": 5, \"全\": 5, \"দ\": 5, \"斯\": 5, \"হ\": 5, \"览\": 5, \"৪\": 5, \"৭\": 5, \"景\": 5, \"ઇ\": 5, \"語\": 5, \"ડ\": 5, \"ધ\": 5, \"动\": 5, \"他\": 5, \"以\": 5, \"月\": 5, \"机\": 5, \"面\": 5, \"软\": 5, \"得\": 5, \"将\": 4, \"后\": 4, \"–\": 4, \"Р\": 4, \"q\": 4, \"系\": 4, \"能\": 4, \"克\": 4, \"ং\": 4, \"網\": 4, \"重\": 4, \"৬\": 4, \"时\": 4, \"成\": 4, \"个\": 4, \"設\": 4, \"之\": 4, \"序\": 4, \"随\": 4, \"力\": 4, \"ષ\": 4, \"经\": 4, \"们\": 4, \"次\": 4, \"着\": 4, \"来\": 4, \"安\": 4, \"计\": 4, \"运\": 4, \"进\": 4, \"码\": 3, \"名\": 3, \"小\": 3, \"И\": 3, \";\": 3, \"ъ\": 3, \"展\": 3, \"U\": 3, \"«\": 3, \"»\": 3, \"改\": 3, \"其\": 3, \"再\": 3, \"ছ\": 3, \"থ\": 3, \"决\": 3, \"শ\": 3, \"於\": 3, \"ী\": 3, \"释\": 3, \"里\": 3, \"量\": 3, \"解\": 3, \"৩\": 3, \"৫\": 3, \"移\": 3, \"分\": 3, \"万\": 3, \"計\": 3, \"带\": 3, \"版\": 3, \"前\": 3, \"广\": 3, \"અ\": 3, \"આ\": 3, \"互\": 3, \"ચ\": 3, \"ણ\": 3, \"થ\": 3, \"度\": 3, \"人\": 3, \"络\": 3, \"统\": 3, \"因\": 3, \"目\": 3, \"维\": 3, \"件\": 3, \"包\": 3, \"本\": 3, \"但\": 3, \"等\": 3, \"作\": 3, \"正\": 3, \"使\": 3, \"後\": 3, \"算\": 3, \"微\": 3, \"家\": 3, \"提\": 3, \"译\": 3, \"取\": 3, \"变\": 3, \"吉\": 2, \"逐\": 2, \"“\": 2, \"М\": 2, \"”\": 2, \"Н\": 2, \"О\": 2, \"Т\": 2, \"#\": 2, \"Я\": 2, \"样\": 2, \":\": 2, \"求\": 2, \"B\": 2, \"象\": 2, \"顿\": 2, \"没\": 2, \"装\": 2, \"风\": 2, \"脑\": 2, \"由\": 2, \"甲\": 2, \"放\": 2, \"流\": 2, \"統\": 2, \"起\": 2, \"要\": 2, \"ঁ\": 2, \"অ\": 2, \"文\": 2, \"ও\": 2, \"写\": 2, \"ঙ\": 2, \"ণ\": 2, \"ধ\": 2, \"视\": 2, \"姆\": 2, \"跨\": 2, \"自\": 2, \"路\": 2, \"已\": 2, \"出\": 2, \"下\": 2, \"帕\": 2, \"標\": 2, \"业\": 2, \"初\": 2, \"模\": 2, \"所\": 2, \"虚\": 2, \"执\": 2, \"詹\": 2, \"承\": 2, \"节\": 2, \"ઈ\": 2, \"ઓ\": 2, \"ખ\": 2, \"際\": 2, \"加\": 2, \"务\": 2, \"约\": 2, \"દ\": 2, \"骨\": 2, \"ફ\": 2, \"线\": 2, \"立\": 2, \"盖\": 2, \"拟\": 2, \"团\": 2, \"继\": 2, \"૧\": 2, \"端\": 2, \"૯\": 2, \"更\": 2, \"相\": 2, \"持\": 2, \"弃\": 2, \"指\": 2, \"看\": 2, \"演\": 2, \"引\": 2, \"；\": 2, \"期\": 2, \"场\": 2, \"单\": 2, \"字\": 2, \"此\": 2, \"步\": 2, \"载\": 2, \"简\": 2, \"较\": 2, \"它\": 2, \"历\": 2, \"來\": 2, \"很\": 2, \"完\": 2, \"林\": 2, \"宣\": 2, \"认\": 2, \"接\": 2, \"推\": 2, \"许\": 2, \"容\": 2, \"宽\": 2, \"设\": 2, \"反\": 2, \"远\": 2, \"口\": 2, \"该\": 2, \"可\": 2, \"翰\": 2, \"诺\": 2, \"导\": 2, \"封\": 1, \"态\": 1, \"球\": 1, \"各\": 1, \"标\": 1, \"「\": 1, \"」\": 1, \"導\": 1, \"А\": 1, \"少\": 1, \"Г\": 1, \"途\": 1, \"尔\": 1, \"耗\": 1, \"З\": 1, \"通\": 1, \"Л\": 1, \"速\": 1, \"造\": 1, \"倡\": 1, \"У\": 1, \"Ч\": 1, \"含\": 1, \"Э\": 1, \"就\": 1, \"核\": 1, \"总\": 1, \"格\": 1, \"倾\": 1, \"层\": 1, \"告\": 1, \"桌\": 1, \"联\": 1, \"健\": 1, \"恩\": 1, \"遭\": 1, \"職\": 1, \"项\": 1, \"须\": 1, \"类\": 1, \"命\": 1, \"预\": 1, \"增\": 1, \"钟\": 1, \"那\": 1, \"為\": 1, \"碼\": 1, \"精\": 1, \"裁\": 1, \"品\": 1, \"擁\": 1, \"情\": 1, \"惊\": 1, \"烤\": 1, \"部\": 1, \"注\": 1, \"森\": 1, \"壮\": 1, \"購\": 1, \"销\": 1, \"处\": 1, \"备\": 1, \"复\": 1, \"植\": 1, \"外\": 1, \"错\": 1, \"產\": 1, \"质\": 1, \"天\": 1, \"支\": 1, \"头\": 1, \"收\": 1, \"示\": 1, \"画\": 1, \"商\": 1, \"效\": 1, \"先\": 1, \"態\": 1, \"赖\": 1, \"入\": 1, \"照\": 1, \"業\": 1, \"数\": 1, \"关\": 1, \"具\": 1, \"兼\": 1, \"长\": 1, \"আ\": 1, \"উ\": 1, \"見\": 1, \"ঐ\": 1, \"首\": 1, \"新\": 1, \"方\": 1, \"施\": 1, \"见\": 1, \"ূ\": 1, \"ৈ\": 1, \"應\": 1, \"种\": 1, \"科\": 1, \"几\": 1, \"无\": 1, \"日\": 1, \"门\": 1, \"編\": 1, \"早\": 1, \"闭\": 1, \"称\": 1, \"闹\": 1, \"市\": 1, \"三\": 1, \"訊\": 1, \"舍\": 1, \"戏\": 1, \"渐\": 1, \"划\": 1, \"专\": 1, \"易\": 1, \"或\": 1, \"队\": 1, \"般\": 1, \"種\": 1, \"制\": 1, \"游\": 1, \"举\": 1, \"時\": 1, \"附\": 1, \"幅\": 1, \"手\": 1, \"降\": 1, \"虎\": 1, \"乔\": 1, \"也\": 1, \"除\": 1, \"物\": 1, \"马\": 1, \"副\": 1, \"并\": 1, \"智\": 1, \"蚀\": 1, \"争\": 1, \"事\": 1, \"源\": 1, \"些\": 1, \"ઝ\": 1, \"功\": 1, \"交\": 1, \"级\": 1, \"隨\": 1, \"努\": 1, \"暴\": 1, \"હ\": 1, \"ૂ\": 1, \"雅\": 1, \"集\": 1, \"拆\": 1, \"ૌ\": 1, \"从\": 1, \"動\": 1, \"站\": 1, \"雛\": 1, \"竞\": 1, \"回\": 1, \"廣\": 1, \"૨\": 1, \"૩\": 1, \"૫\": 1, \"括\": 1, \"独\": 1, \"英\": 1, \"直\": 1, \"任\": 1, \"曾\": 1, \"仿\": 1, \"需\": 1, \"最\": 1, \"企\": 1, \"́\": 1, \"載\": 1, \"伊\": 1, \"服\": 1, \"化\": 1, \"会\": 1, \"：\": 1, \"猛\": 1, \"传\": 1, \"挤\": 1, \"符\": 1, \"第\": 1, \"地\": 1, \"伴\": 1, \"圾\": 1, \"十\": 1, \"杂\": 1, \"升\": 1, \"位\": 1, \"低\": 1, \"体\": 1, \"罗\": 1, \"非\": 1, \"靠\": 1, \"形\": 1, \"学\": 1, \"譯\": 1, \"却\": 1, \"併\": 1, \"垃\": 1, \"率\": 1, \"排\": 1, \"枚\": 1, \"供\": 1, \"依\": 1, \"原\": 1, \"採\": 1, \"群\": 1, \"控\": 1, \"箱\": 1, \"侵\": 1, \"德\": 1, \"获\": 1, \"参\": 1, \"埃\": 1, \"參\": 1, \"心\": 1, \"必\": 1, \"迅\": 1, \"密\": 1, \"及\": 1, \"近\": 1, \"比\": 1, \"受\": 1, \"还\": 1, \"话\": 1, \"韦\": 1, \"只\": 1, \"误\": 1, \"号\": 1, \"執\": 1";

}
