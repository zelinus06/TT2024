# Kiến trúc MySQL
 ## 1. Gồm 3 layer: Application layer, server layer, engine layer.
 ### Application layer:
  - Chức năng chính: connection handling, authentication, security.
  - Thành phần: Administrators, Clients, Query Users.
	+ Administrator:Gồm mysql admin và mysql dump.
	 Mysql admin: tắt máy chủ, tạo, hủy cơ sở dữ liệu.
	 Mysql dump: sao chép, sao lưu csdl sang một máy chủ khác

  	+ Clients: giao tiếp với MySQL qua các giao diện và tiện ích khác nhau như MySQL API

	+ Query Users: truy vấn tương tác với MySQL RDBMS thông qua giao diện truy vấn là mysql.

 ### Server layer
 - Thành phần gồm: 
	MySQL services and utilities
	SQL Interface
	SQL Parser
	Optimizer
	Caches
 - Parser:
   + Được sử dụng để phân tích cú pháp câu lệnh SQL để gửi đến csdl
   + 2 giai đoạn là phân tích từ vựng và phân tích cú pháp
   + Phân tích từ vựng: kiểm tra xem câu lệnh SQL có tuân theo cú pháp của MySQL hay không
   + Phân tích cú pháp:  parser kiểm tra tính hợp lệ của ngữ nghĩa câu lệnh trong ngữ cảnh của cơ sở dữ liệu
   + Sau khi hoàn tất thì một parsing tree sẽ được tạo ra

 - Optimizer:
   + Là một server module chịu trách nhiệm xác  định kế hoạch thực thi cho câu lệnh SQL
   + Gồm: 
    ++ Query Optimizer: Xác định kế hoạch thực hiện câu lệnh
    ++ Execution Optimizer: Xác định kế hoạc thực thi
 - Cache:
   + Lưu trữ các bộ kết quả hoàn chỉnh cho câu lệnh select
   + Trước khi parser, máy chủ mysql tham khảo cache và nếu có một truy vấn giống hệt với truy vấn trong cache thì 
     máy chủ bỏ qua parser và optimizer để thực thi hoặc hiển thị luôn kết quả.
 - MySQL service and utilities: Cung cấp các dịch vụ và tiện ích khác nhau của mysql

 ### Storage engine layer
 - cung cấp các dịch vụ để lưu trữ, truy xuất và quản lý dữ liệu trên đĩa
 - cho phép ta lựa chọn nhiều storage engine khác nhau như: 
	MyISAM
	InnoDB
	Federated
	Mrg_MyISAM
	Blackhole
	CSV
	Memory
	Archive


# Khái niệm CAP, BASE, ACID

## CAP

 - Viết tắt: Viết tắt của Consistency, Available, Particion tolerance
 - Định lý CAP đề cập đến một hệ thống phân tán chỉ có thể có được hai trong ba đặc tính trên.
 - Sử dụng và áp dụng nhiều cho các hệ thống cơ sở dữ liệu NoSQL.

## BASE

 - Tính sẵn sàng ở mức cơ bản: người dùng luôn có khả năng truy cập DB. Người dùng không phải đợi người dùng khác hoàn thành giao dịch rồi ms đc dùng
 - Trạng thái mềm: + Đề cập đến khái niệm dữ liệu có thể có trạng thái thoáng qua hoặc tạm thời có thể thay đổi.
		   + Giá trị của bản ghi chỉ được hoàn tất toàn bộ sau khi hoàn thành tất cả các giao dịch
 - Nhất quán toàn bộ: + bản ghi sẽ đạt được tính nhất quán khi tất cả các bản cập nhật đồng thời đã được hoàn thành
		      +  các ứng dụng truy vấn bản ghi sẽ thấy cùng một giá trị sau khi hoàn thành giao dịch

## ACID

 - Tính nguyên tử: 
	+ đảm bảo tất cả các bước trong một giao dịch cơ sở dữ liệu duy nhất được hoàn thành đầy đủ hoặc trở lại trạng thái ban đầu.

 - Tính nhất quán:
	+ đảm bảo dữ liệu đáp ứng các hạn chế về tính toàn vẹn và quy tắc được xác định trước

 - Tính cô lập:
	+ đảm bảo rằng một giao dịch mới sẽ chờ đến khi giao dịch trước đó kết thúc trước khi giao dịch mới bắt đầu hoạt động.
 - Độ bền:
	+ đảm bảo cơ sở dữ liệu duy trì tất cả các bản ghi đã được xác nhận thực thi, ngay cả khi hệ thống gặp lỗi.

# Trình bày về các loại Database:

## MySQL

- Đặc điểm chính:
  + Mã nguồn mở và Miễn phí: MySQL được phát triển và phân phối dưới dạng mã nguồn mở, có thể sử dụng và tùy chỉnh nó mà không cần phải trả phí cho giấy phép.

  + Hỗ trợ chuẩn SQL: MySQL tuân theo chuẩn SQL

  + Tính di động và mở rộng: MySQL hỗ trợ các tính năng như partitioning, replication, và sharding để tối ưu hóa hiệu suất và mở rộng dữ liệu theo nhu cầu.

  + Hỗ trợ nhiều nền tảng: MySQL có sẵn cho nhiều hệ điều hành như Linux, Windows, MacOS

  + Hiệu suất cao: MySQL được tối ưu hóa để cung cấp hiệu suất tốt, đặc biệt là trong các môi trường với tải công việc cao hoặc với lượng dữ liệu lớn.

  + Bảo mật: MySQL cung cấp các tính năng bảo mật như quản lý người dùng và quyền truy cập, mã hóa dữ liệu, và kiểm soát truy cập dựa trên IP, giúp bảo vệ dữ liệu của bạn.

- Tính năng nổi bật:
  
  + Replication: MySQL hỗ trợ replication để sao chép và phân phối dữ liệu giữa các máy chủ MySQL khác nhau

  + Partitioning: Partitioning cho phép phân chia dữ liệu thành các phần nhỏ hơn, giúp cải thiện hiệu suất truy vấn và quản lý dữ liệu trong các hệ thống lớn.

  + Triggers và Stored Procedures: MySQL hỗ trợ triggers và stored procedures, cho phép bạn thực hiện các hành động tự động hoặc các thủ tục lưu trữ được định nghĩa trước trên cơ sở dữ liệu.

  + InnoDB Storage Engine: InnoDB là một storage engine mạnh mẽ được tích hợp sẵn trong MySQL, cung cấp các tính năng như giao dịch, khóa cấp dòng (row-level locking), và kiểm soát nhất quán dữ liệu.

  + Cluster và High Availability: MySQL cung cấp các giải pháp cluster và high availability để đảm bảo sự sẵn sàng và khả năng chịu lỗi của hệ thống.

## SQLServer

- Đặc điểm chính:
  + Tích hợp sâu với các sản phẩm Microsoft

  + Hỗ trợ chuẩn SQL và Transact-SQL (T-SQL): SQL Server tuân thủ chuẩn SQL và cung cấp một ngôn ngữ truy vấn mạnh mẽ gọi là Transact-SQL (T-SQL). T-SQL cung cấp nhiều tính năng tiện ích như stored procedures, triggers, và functions.

  + Tính ổn định và tin cậy: SQL Server nổi tiếng với tính ổn định và tin cậy, với khả năng chịu lỗi cao và khả năng phục hồi dữ liệu mạnh mẽ

  + Hỗ trợ phân tích dữ liệu và Business Intelligence (BI): SQL Server cung cấp các tính năng phân tích dữ liệu và Business Intelligence (BI) n

  + Tính năng bảo mật mạnh mẽ: SQL Server cung cấp các tính năng bảo mật mạnh mẽ

  + Hỗ trợ phân phối và mở rộng: SQL Server cung cấp các tính năng như phân phối dữ liệu (Data Distribution) và cơ chế phân phối dựa trên nội dung (Content-Based Distribution)

- Tính năng nổi bặt:

  + Always On Availability Groups: Always On Availability Groups là một tính năng cao cấp của SQL Server

  + Columnstore Indexes: Columnstore Indexes là một tính năng cải tiến hiệu suất truy vấn cho các bảng lớn bằng cách tổ chức dữ liệu thành cột thay vì hàng, giúp cải thiện hiệu suất truy xuất dữ liệu trong các truy vấn phân tích và báo cáo.

  + In-Memory OLTP: In-Memory OLTP (Hướng nhớ tốc độ) là một tính năng cho phép bạn tạo các bảng và lưu trữ dữ liệu hoàn toàn trong bộ nhớ, giúp tăng tốc độ xử lý cho các ứng dụng đòi hỏi hiệu suất cao.

  + Tích hợp với Azure và công nghệ Cloud: SQL Server có sự tích hợp chặt chẽ với Microsoft Azure và công nghệ đám mây, cung cấp các tính năng như SQL Database và SQL Managed Instance để triển khai và quản lý cơ sở dữ liệu trong môi trường đám mây.

  + Advanced Analytics: SQL Server cung cấp tính năng Advanced Analytics để phân tích dữ liệu và xây dựng mô hình dự đoán bằng cách tích hợp với các công nghệ như R và Python, giúp phát triển các ứng dụng thông minh và dự đoán.

## PostgreSQL

- Đặc điểm chính:

  + Mã nguồn mở và miễn phí

  + Hỗ trợ đa nền tảng

  + Hỗ trợ chuẩn SQL đầy đủ: PostgreSQL tuân thủ nhiều chuẩn SQL, bao gồm cả chuẩn SQL:2016

  + Tính di động và mở rộng: PostgreSQL cung cấp các tính năng như partitioning, replication, và sharding để tối ưu hóa hiệu suất và mở rộng dữ liệu theo nhu cầu.
 
  + Tính năng ACID-compliant: PostgreSQL tuân thủ các tính chất ACID (Atomicity, Consistency, Isolation, Durability), giúp đảm bảo tính nhất quán và an toàn của dữ liệu trong quá trình xử lý giao dịch.

  + Tính mở rộng và mô đun hóa: PostgreSQL hỗ trợ mô đun hóa và mở rộng thông qua các extension, cho phép bạn mở rộng chức năng của PostgreSQL bằng cách thêm vào các tính năng mới và tùy chỉnh theo nhu cầu của bạn.

- Tính năng nổi bật:
  + JSON và JSONB support: PostgreSQL cung cấp hỗ trợ cho việc lưu trữ và truy vấn dữ liệu JSON thông qua các kiểu dữ liệu và hàm tương ứng. JSONB là một kiểu dữ liệu binary được tối ưu hóa cho việc truy vấn và lọc dữ liệu JSON nhanh chóng.

  + Full Text Search: PostgreSQL cung cấp tính năng Full Text Search, cho phép bạn tìm kiếm và truy vấn văn bản theo cách linh hoạt và hiệu quả.

  + Multi-Version Concurrency Control (MVCC): PostgreSQL sử dụng MVCC để hỗ trợ đọc cắt lớp và đọc không chặn, giúp tăng hiệu suất trong các môi trường có nhiều giao dịch cùng lúc.

  + Geospatial support: PostgreSQL hỗ trợ các tính năng địa lý và không gian, cho phép bạn lưu trữ và truy vấn dữ liệu địa lý một cách hiệu quả.

  + Logical Replication: PostgreSQL hỗ trợ logical replication, cho phép bạn sao chép và phân phối dữ liệu theo cách linh hoạt và tùy chỉnh.

## MongoDB(Document)
- Document store được gọi là các cơ sở dữ liệu hướng tài liệu, một thiết kế riêng biệt cho việc lưu trữ tài liệu dạng văn kiện JSON, BSON hoặc XML.
- Các tài liệu có thể chứa bất kì dữ liệu nào. CSDL dạng này có các cặp khoá – giá trị nhưng cũng có đính kèm các trị số siêu dữ liệu (*metadata) giúp việc truy vấn (*query) dễ dàng hơn.
### Điểm mạnh:
 + Có thể tạo ra kiến trúc dữ liệu cho một tài liệu cụ thể mà không ảnh hưởng tài liệu khác
 + Người dùng không cần quan tâm dạng dữ liệu khi setup
 + Dễ dàng mở rộng theo chiều ngang, thời gian ghi dữ liệu nhanh
### Điểm yếu:
 + Hy sinh yếu tố ACID để đổi lấy sự linh hoạt
 + Chỉ có thể truy vấn trên từng tài liệu

MongoDB là một hệ quản trị cơ sở dữ liệu không cấu trúc (NoSQL) phổ biến, được thiết kế để lưu trữ và xử lý dữ liệu dưới dạng tài liệu JSON linh hoạt.

- Đặc điểm chính:

  + Dữ liệu dưới dạng tài liệu: MongoDB lưu trữ dữ liệu dưới dạng tài liệu JSON có cấu trúc linh hoạt, gọi là BSON (Binary JSON)

  + Mã nguồn mở và miễn phí

  + Phù hợp và hỗ trợ rất mạnh cho các ứng dụng realtime

  + Tính mở rộng và mô đun hóa: MongoDB hỗ trợ tính mở rộng dữ liệu và tính linh hoạt thông qua các tính năng như sharding và replication

  + Query Language linh hoạt: MongoDB cung cấp một ngôn ngữ truy vấn linh hoạt và mạnh mẽ, cho phép bạn thực hiện các truy vấn phức tạp và linh hoạt trên dữ liệu, bao gồm cả các truy vấn phức tạp về mảng và nhúng đối tượng.

- Tính năng nổi bật:

  + Sharding: MongoDB hỗ trợ sharding, cho phép bạn phân tán dữ liệu trên nhiều máy chủ để tối ưu hóa hiệu suất và mở rộng khả năng lưu trữ.

  + Replication: MongoDB cung cấp tính năng replication để sao chép và phân phối dữ liệu giữa các máy chủ, giúp tăng cường sự sẵn sàng và khả năng chịu lỗi của hệ thống.

  + Aggregation Framework: MongoDB cung cấp một Framework Aggregation mạnh mẽ cho phép bạn thực hiện các phép tính toán phức tạp và xử lý dữ liệu trên dữ liệu lớn.

  + Hỗ trợ đa dạng dạng dữ liệu: MongoDB hỗ trợ lưu trữ và truy vấn nhiều loại dữ liệu khác nhau như văn bản, hình ảnh, âm thanh, và video.

## Redis(key-value)

- Các HQT CSDL Key-value lưu trữ dữ liệu dưới dạng key (là một chuỗi duy nhất) liên kết với value có thể ở dạng chuỗi văn bản đơn giản hoặc các tập

- CDSL chìa khoá – giá trị là một dạng CSDL phi quan hệ nơi mà mỗi giá trị được gán cho một key (chìa khoá) nhất định.

- Một “key” là một định danh độc nhất được gán cho một giá trị. Keys có thể là bất cứ thứ gì cho phép bởi DBMS. Trong Redis, keys có thể là một hàm nhị phân lên tới 512MB

- Redis là một hệ quản trị cơ sở dữ liệu key-value in-memory (dữ liệu được lưu trữ trong bộ nhớ), được sử dụng phổ biến cho việc lưu trữ cache, hàng đợi thông điệp, và các ứng dụng real-time.

### Điểm mạnh:
 + Linh hoạt, xử lí nhiều loại dữ liệu một cách nhanh chóng
 + Mở rộng theo chiều ngang, chi phí thấp

### Điểu yếu:
 + Tính linh hoạt của CSDL dạng key – value bị đánh đổi bởi tính chính xác
- Đặc điểm chính:

 + In-Memory Data Store: Redis lưu trữ dữ liệu trong bộ nhớ, cho phép truy cập nhanh chóng và hiệu suất cao. Dữ liệu có thể được lưu trữ dưới dạng key-value, hash, list, set, sorted set và các cấu trúc dữ liệu khác.

 + Sử Dụng Disk Persistence: Redis hỗ trợ các cơ chế persistence để lưu trữ dữ liệu xuống ổ đĩa, cho phép khôi phục dữ liệu sau khi khởi động lại hệ thống.

 + Hỗ Trợ Cấu Trúc Dữ Liệu Phong Phú: Redis cung cấp nhiều loại cấu trúc dữ liệu như Strings, Lists, Sets, Sorted Sets, Hashes, HyperLogLogs, và Geospatial Indexes, giúp phù hợp với nhiều loại ứng dụng và trường hợp sử dụng.

 + Tính Năng Pub/Sub: Redis hỗ trợ tính năng Publish/Subscribe (Pub/Sub), cho phép các client đăng ký nhận thông điệp từ các kênh (channels) và phát đi thông điệp tới các kênh đó.

 + Hỗ Trợ Transaction: Redis hỗ trợ transaction, cho phép thực hiện một loạt các lệnh Redis như một giao dịch duy nhất, đảm bảo tính nhất quán của dữ liệu.

 + Replication: Cho phép sao chép dữ liệu từ một máy chủ Redis (master) sang các máy chủ khác (slaves)

- Tính năng nổi bật:

 + Cache Store: Redis thường được sử dụng làm cache store để lưu trữ dữ liệu cache tạm thời, giúp giảm thời gian truy cập vào dữ liệu từ cơ sở dữ liệu chính và tăng tốc độ của ứng dụng.

 + Message Broker: Redis có thể được sử dụng như một message broker để xử lý các hàng đợi thông điệp và giao tiếp giữa các thành phần của hệ thống.

 + Real-time Analytics: Redis có khả năng xử lý và phân tích dữ liệu real-time, đặc biệt phù hợp với các ứng dụng cần phản hồi nhanh và xử lý dữ liệu theo thời gian thực.

 + Session Store: Redis có thể được sử dụng để lưu trữ thông tin phiên (session) của người dùng, giúp quản lý phiên và đảm bảo tính nhất quán của dữ liệu.

 + Counter và Leaderboard: Redis thích hợp cho việc lưu trữ và tính toán counter và leaderboard trong các ứng dụng trò chơi hoặc xã hội.

## Cassandra(Column)

- Mô hình column là một dạng lưu CSDL phi quan hệ lưu trữ theo dạng cột. Mô hình này có vài điểm tương đồng với mô hình key – value nhưng cũng có vài tính chất của dạng CSDL quan hệ.
### Điểm mạnh:
 + CSDL dạng cột có khả năng nén tốt hơn CSDL dạng dòng. Đồng thời, data set lớn có thể dễ dàng duyệt hơn
### Điểm yếu:
 + CSDL dạng cột dễ dàng update theo cụm, bù lại việc upload và update số liệu cá nhân rất khó
 + Xử lí các giao dịch chậm hơn so với rdbms

- Đặc điểm chính:

 + Phân Tán và Mở Rộng: Cassandra được thiết kế để hoạt động trên một mạng phân tán các nút (nodes), cho phép dữ liệu được phân tán trên nhiều máy chủ

 + Tính Công Bằng (Tolerance to Faults): Cassandra có khả năng chịu lỗi cao bằng cách sao chép dữ liệu trên nhiều nút. Khi một nút gặp sự cố, dữ liệu có thể được truy cập từ các nút khác trong mạng.

 + Hỗ Trợ Câu Truy Vấn Trong Thời Gian Thực: Cassandra hỗ trợ việc truy vấn dữ liệu trong thời gian thực, cho phép bạn thực hiện các truy vấn phức tạp trên tập dữ liệu lớn với thời gian đáp ứng nhanh chóng.

 + Khả Năng Mở Rộng Tuyến Tính: Cassandra có thể mở rộng tuyến tính với số lượng nút, điều này có nghĩa là bạn có thể thêm nhiều nút mới vào mạng mà không làm ảnh hưởng đến hiệu suất của hệ thống.

 + Tính Nhất Quán (Tunable Consistency): Cassandra cho phép điều chỉnh mức độ nhất quán (consistency level) của các hoạt động ghi và đọc, giúp bạn điều chỉnh sự đồng thuận giữa các nút theo nhu cầu của ứng dụng.

 + Cấu Trúc Dữ Liệu Phong Phú: Cassandra hỗ trợ các cấu trúc dữ liệu phong phú bao gồm cả bảng (tables), cột (columns), hàng (rows), và các cấu trúc dữ liệu phức tạp như các cột có thể chứa các collection và nesting.

- Tính năng nổi bật:

 + CQL (Cassandra Query Language): Cassandra cung cấp một ngôn ngữ truy vấn SQL tương tự nhưng được tùy chỉnh cho môi trường phân tán, giúp thực hiện các truy vấn phức tạp trên dữ liệu phân tán một cách dễ dàng.

 + Tính Công Bằng (Tolerance to Faults): Cassandra tự động phân phối và sao chép dữ liệu trên nhiều nút

 + Tính Năng Khôi Phục Sau Sự Cố (Disaster Recovery): Cassandra hỗ trợ sao lưu và phục hồi dữ liệu tự động, giúp khôi phục dữ liệu sau sự cố hoặc mất mát dữ liệu.

 + Hỗ Trợ Truy Vấn Phân Tán (Distributed Query Support): Cassandra hỗ trợ truy vấn phân tán trên nhiều nút, giúp tối ưu hóa hiệu suất và sự mở rộng của hệ thống.

 + Hỗ Trợ Đa Datacenter: Cassandra hỗ trợ triển khai đa datacenter, cho phép bạn phân phối dữ liệu trên nhiều vùng địa lý
