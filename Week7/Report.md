# Domain Driven Design

## Tổng quan

Domain Driven Design (DDD) là một phương pháp thiết kế phần mềm tập trung vào việc hiểu rõ về ngữ cảnh và logic của lĩnh vực (domain) mà phần mềm đang xây dựng. DDD nhấn mạnh vào việc tạo ra một mô hình chính xác của lĩnh vực và sử dụng ngôn ngữ phong phú trong domain để tạo ra các mô hình phản ánh sát nhất với thế giới thực.

## Cách thức hoạt động

1. **Mô hình hóa lĩnh vực (Domain Modeling):** DDD tập trung vào việc hiểu rõ về lĩnh vực của phần mềm và tạo ra một mô hình chính xác của lĩnh vực đó.

2. **Ngôn ngữ phong phú trong domain (Ubiquitous Language):** Sử dụng cùng một ngôn ngữ chung và phong phú trong cả team phát triển và các chuyên gia domain để tránh hiểu nhầm và tạo ra các mô hình dễ đọc và dễ hiểu.

3. **Phân chia lớp (Layered Architecture):** Sử dụng kiến trúc phân chia lớp để phân tách logic của ứng dụng thành các lớp riêng biệt như Domain Layer, Application Layer, Infrastructure Layer...

4. **Aggregate và Entity:** Sử dụng Aggregate để nhóm các đối tượng liên quan và quản lý thao tác trên chúng, Entity để biểu diễn các đối tượng có ý nghĩa riêng biệt trong lĩnh vực.

## Kỹ thuật

1. **Ubiquitous Language Tool:** Công cụ hỗ trợ việc phát triển ngôn ngữ phong phú trong domain và đảm bảo sự đồng nhất trong cả team.

2. **Domain Events:** Kỹ thuật cho phép ghi lại các sự kiện quan trọng trong lĩnh vực để có thể tái tạo hoặc theo dõi quá trình xử lý dữ liệu.

3. **Repository Pattern:** Mô hình Repository giúp tách biệt logic của việc truy xuất dữ liệu ra khỏi logic của ứng dụng.

## Ưu điểm

- DDD giúp tạo ra các ứng dụng dễ bảo trì và mở rộng bằng cách tạo ra các mô hình phản ánh đúng với thế giới thực.
- Sử dụng ngôn ngữ phong phú trong domain giúp giảm thiểu hiểu nhầm giữa các thành viên trong team phát triển.
- Phân chia logic của ứng dụng thành các lớp riêng biệt giúp dễ dàng quản lý và bảo trì.

## Nhược điểm

- Đòi hỏi kiến thức sâu về lĩnh vực của ứng dụng để có thể thiết kế một mô hình chính xác.
- Cần phải có sự hiểu biết về các kỹ thuật và công cụ hỗ trợ để triển khai DDD hiệu quả.


# CQRS và Event Sourcing

## Tổng quát

CQRS (Command Query Responsibility Segregation) và Event Sourcing là hai mô hình thiết kế phần mềm được sử dụng để xây dựng các hệ thống có tính mở rộng, linh hoạt và dễ bảo trì. Cả hai mô hình này đều tập trung vào việc tách biệt trách nhiệm giữa việc xử lý các lệnh (commands) và truy vấn (queries), đồng thời sử dụng sự kiện (events) làm nguồn dữ liệu chính.

## CQRS (Command Query Responsibility Segregation)

CQRS là một mô hình thiết kế phần mềm tách biệt trách nhiệm giữa việc xử lý các yêu cầu thay đổi trạng thái của hệ thống (commands) và việc truy vấn dữ liệu từ hệ thống (queries). Dưới đây là cách thức hoạt động của CQRS:

1. **Commands:**
    - Khi một yêu cầu thay đổi trạng thái của hệ thống được gửi đến, nó được biểu diễn dưới dạng một command.
    - Mỗi command có một hành động cụ thể mà hệ thống phải thực hiện, chẳng hạn như thêm, sửa đổi hoặc xóa dữ liệu.
    - Commands được xử lý bởi các thành phần chuyên biệt trong hệ thống, gọi là Command Handlers.

2. **Queries:**
    - Khi cần truy vấn dữ liệu từ hệ thống, một query được gửi đi.
    - Query chỉ đọc dữ liệu từ hệ thống mà không thay đổi trạng thái của nó.
    - Queries được xử lý bởi các thành phần chuyên biệt trong hệ thống, gọi là Query Handlers.

## Event Sourcing

Event Sourcing là một mô hình lưu trữ dữ liệu trong đó toàn bộ trạng thái của hệ thống được biểu diễn dưới dạng các sự kiện (events). Dưới đây là cách thức hoạt động của Event Sourcing:

1. **Lưu trữ sự kiện:**
    - Mỗi lần có sự thay đổi trạng thái trong hệ thống, một sự kiện tương ứng được tạo ra và lưu trữ.
    - Sự kiện này chứa thông tin chi tiết về các thay đổi đã xảy ra.

2. **Tái tạo trạng thái:**
    - Thay vì lưu trữ trạng thái hiện tại của hệ thống, toàn bộ lịch sử các sự kiện được sử dụng để tái tạo trạng thái hiện tại của hệ thống.
    - Bằng cách phát lại toàn bộ các sự kiện theo thứ tự, trạng thái hiện tại của hệ thống có thể được tái tạo một cách nhất quán.

## Ưu Điểm

### CQRS:
- **Tính mở rộng:** Cho phép tăng cường hiệu suất và mở rộng dễ dàng bằng cách tối ưu hóa xử lý lệnh và truy vấn riêng biệt.
- **Tính linh hoạt:** Cho phép tách biệt logic xử lý lệnh và truy vấn, giúp phát triển và bảo trì hệ thống dễ dàng hơn.

### Event Sourcing:
- **Tính nhất quán:** Đảm bảo tính nhất quán của dữ liệu bằng cách lưu trữ toàn bộ lịch sử các sự kiện.
- **Khả năng phục hồi:** Cho phép hệ thống dễ dàng phục hồi trạng thái trước đó bằng cách phát lại các sự kiện.

## Nhược Điểm

### CQRS:
- **Phức tạp hóa:** Yêu cầu kiến thức cao và quản lý các thành phần riêng biệt cho xử lý lệnh và truy vấn có thể làm phức tạp hóa hệ thống.

### Event Sourcing:
- **Tăng cường chi phí lưu trữ:** Lưu trữ toàn bộ lịch sử các sự kiện có thể tăng chi phí lưu trữ so với lưu trữ trạng thái hiện tại.
- **Khó khăn trong gỡ lỗi:** Đòi hỏi sự hiểu biết sâu về lịch sử các sự kiện để gỡ lỗi và quản lý hệ thống.


# ORMs & Transactions

## Tổng quan

Trong phát triển ứng dụng Java liên quan đến cơ sở dữ liệu, việc sử dụng ORM (Object-Relational Mapping) và Transaction Management là rất phổ biến. ORMs giúp quản lý đối tượng và tương tác với cơ sở dữ liệu một cách dễ dàng, trong khi Transaction Management giúp bảo đảm tính nhất quán và độ tin cậy của dữ liệu.

## ORM (Object-Relational Mapping)

ORM (Object-Relational Mapping) là một kỹ thuật cho phép ánh xạ giữa các đối tượng trong ứng dụng Java và các bảng trong cơ sở dữ liệu. Trong Java, có nhiều thư viện ORM phổ biến như Hibernate, JPA (Java Persistence API), MyBatis và EclipseLink. Dưới đây là một số điểm chính về ORM trong Java:

1. **Tính Trừu Tượng Hóa:** ORM giúp ẩn đi chi tiết về cách dữ liệu được lưu trữ và truy xuất từ cơ sở dữ liệu, tập trung vào việc làm việc với các đối tượng Java thay vì SQL. Điều này giúp giảm sự phức tạp trong việc quản lý cơ sở dữ liệu và tăng tính linh hoạt của ứng dụng.

2. **Ánh Xạ Đối Tượng-Bảng (Object-Relational Mapping):** ORM tự động ánh xạ các đối tượng Java vào các bảng trong cơ sở dữ liệu và ngược lại. Điều này giúp giảm bớt công việc lặp lại trong việc tạo các truy vấn SQL và tự động tạo cấu trúc cơ sở dữ liệu dựa trên các định nghĩa đối tượng.

3. **Tối Ưu Hóa Dữ Liệu và Hiệu Suất:** ORM cung cấp các công cụ để tối ưu hóa truy vấn và quản lý kết nối đến cơ sở dữ liệu, giúp cải thiện hiệu suất của ứng dụng. Hibernate, ví dụ, cung cấp bộ lọc và gợi ý câu lệnh SQL để tối ưu hóa truy vấn.

## Transaction Management

Transaction Management là quá trình quản lý các giao dịch trong cơ sở dữ liệu để đảm bảo tính nhất quán và độ tin cậy của dữ liệu. Trong Java, quản lý giao dịch thường được thực hiện thông qua JDBC (Java Database Connectivity) hoặc các framework như Spring. Dưới đây là một số điểm chính về Transaction Management trong Java:

1. **Giao Dịch (Transactions):** Giao Dịch là một tập hợp các thao tác đọc hoặc ghi dữ liệu vào cơ sở dữ liệu. Mỗi giao dịch phải được bắt đầu (begin), thực thi (execute), và kết thúc (commit hoặc rollback) một cách an toàn.

2. **Quản Lý Giao Dịch:** Trong Java, quản lý giao dịch có thể được thực hiện bằng cách sử dụng các annotation và công cụ như @Transactional trong Spring Framework. Điều này giúp tự động quản lý các giao dịch và đảm bảo tính nhất quán của dữ liệu.

## Ưu Điểm

### ORM:
- **Tính Trừu Tượng Hóa:** Giảm sự phức tạp trong việc làm việc với cơ sở dữ liệu và tăng tính linh hoạt của ứng dụng.
- **Tối Ưu Hóa Dữ Liệu và Hiệu Suất:** Cung cấp các công cụ để tối ưu hóa truy vấn và quản lý kết nối đến cơ sở dữ liệu.

### Transaction Management:
- **Tính Nhất Quán và Độ Tin Cậy:** Đảm bảo tính nhất quán và độ tin cậy của dữ liệu thông qua quản lý các giao dịch.

## Nhược Điểm

- **Học Hỏi và Triển Khai:** Đòi hỏi thời gian và kiến thức kỹ thuật cao để học và triển khai ORM và quản lý giao dịch.
- **Tính Linh Hoạt:** Một số ORM có thể hạn chế tính linh hoạt trong việc tùy chỉnh cách ánh xạ đối tượng vào cơ sở dữ liệu.


# Message Queue: Kafka

## Tổng quát

Apache Kafka là một hệ thống message queue mã nguồn mở được phát triển bởi Apache Software Foundation. Nó được thiết kế để xử lý các luồng dữ liệu lớn và có khả năng mở rộng tốt, đặc biệt phù hợp với các ứng dụng có yêu cầu về xử lý dữ liệu thời gian thực hoặc lưu lượng dữ liệu lớn. Báo cáo này sẽ trình bày chi tiết về Kafka, cách thức hoạt động và ứng dụng của nó.

## Cơ Bản về Kafka

1. **Khái Niệm:**
   - Kafka là một hệ thống message queue có khả năng phân tán và nhận dữ liệu từ nhiều nguồn khác nhau, lưu trữ dữ liệu vào các topic và cho phép các ứng dụng đọc dữ liệu từ các topic đó.
   - Dữ liệu trong Kafka được tổ chức thành các message, mỗi message được gọi là một record, và được lưu trữ trong các partition.

2. **Architecture:**
   - Kafka bao gồm các thành phần chính như Producer, Consumer, Broker và ZooKeeper.
   - Producer là thành phần gửi dữ liệu vào Kafka, Consumer là thành phần nhận dữ liệu từ Kafka, Broker là các node trong cluster Kafka và ZooKeeper là dịch vụ quản lý metadata của Kafka.

## Cách Thức Hoạt Động

1. **Gửi và Nhận Dữ Liệu:**
   - Producer gửi các message vào Kafka bằng cách chỉ định topic và partition mà message đó thuộc về.
   - Consumer đọc các message từ Kafka bằng cách subscribe vào một hoặc nhiều topic và theo dõi các partition của chúng.

2. **Lưu Trữ và Replication:**
   - Dữ liệu trong Kafka được lưu trữ trong các partition trên các broker. Mỗi partition có một bản sao (replica) để đảm bảo tính an toàn và phục hồi.
   - ZooKeeper giúp quản lý các partition, broker và consumer group, cũng như cung cấp dịch vụ nhất quán và đồng bộ cho Kafka cluster.

## Ứng Dụng của Kafka

1. **Stream Processing:**
   - Kafka Streams là một thư viện cho phép xử lý dữ liệu liên tục trong Kafka một cách linh hoạt và dễ dàng.
   - Kafka Streams cho phép các ứng dụng xử lý, biến đổi và phân tích dữ liệu trực tiếp từ các topic Kafka mà không cần các hệ thống ngoài.

2. **Kết Nối Hệ Thống:**
   - Kafka là một nền tảng tuyệt vời cho việc kết nối các hệ thống và ứng dụng khác nhau. Nó có thể được sử dụng để truyền dữ liệu giữa các ứng dụng, hệ thống, và các microservices một cách dễ dàng và hiệu quả.

## Ưu Điểm và Nhược Điểm

### Ưu Điểm:
- **Tính Phân Tán và Mở Rộng:** Kafka có khả năng mở rộng tốt và xử lý lưu lượng dữ liệu lớn một cách hiệu quả.
- **Tính Durable và An Toàn:** Dữ liệu trong Kafka được lưu trữ và đảm bảo tính nhất quán qua các replica.
- **Tích Hợp Dễ Dàng:** Kafka có thể tích hợp với nhiều hệ thống và ứng dụng khác nhau thông qua các thư viện và API.

### Nhược Điểm:
- **Khó Khăn Trong Quản Lý:** Kafka yêu cầu kiến thức cao về quản lý và vận hành để triển khai và duy trì một cụm Kafka.
- **Yêu Cầu Cấu Hình Phức Tạp:** Cấu hình Kafka có thể phức tạp và đòi hỏi sự hiểu biết sâu sắc về cách hoạt động của hệ thống.


# Báo Cáo: Tìm Hiểu về Authentication

## Tổng quan

Authentication là quá trình xác thực người dùng và cung cấp quyền truy cập vào hệ thống hoặc tài nguyên. Trong báo cáo này, chúng ta sẽ tìm hiểu về ba phương pháp phổ biến để thực hiện authentication trong các ứng dụng web và API: JWT (JSON Web Tokens), Basic Auth và Token Auth.

## JWT (JSON Web Tokens)

JWT là một phương pháp authentication được sử dụng phổ biến trong các ứng dụng web và API. Nó hoạt động dựa trên việc tạo ra các token có thể được ký và mã hóa, chứa thông tin về người dùng và các quyền truy cập. Dưới đây là một số điểm chính về JWT:

- **Thông Tin:** JWT chứa thông tin về người dùng và các quyền truy cập dưới dạng payload.
- **Ký và Mã Hóa:** JWT có thể được ký để xác thực và mã hóa để bảo vệ thông tin.
- **Phương Thức Phân Phối:** JWT có thể được gửi từ máy khách đến máy chủ hoặc ngược lại thông qua header HTTP hoặc trường cookie.

### Cách thức hoạt động

 1 **Tạo JWT:**
 - Người dùng đăng nhập vào hệ thống bằng cách cung cấp thông tin đăng nhập (username, password).
 - Máy chủ xác thực thông tin đăng nhập và tạo JWT bằng cách ký (sign) payload (thông tin người dùng) bằng một secret key để tạo ra một chuỗi JWT.

 2. **Gửi JWT:** 

 - JWT được trả về cho người dùng sau khi đăng nhập thành công.
 - Người dùng gửi JWT trong header Authorization của mỗi request tiếp theo đến máy chủ để xác thực.
 3. **Xác Thực JWT:**

 - Máy chủ nhận được JWT từ header Authorization.
 - Máy chủ kiểm tra tính hợp lệ của JWT bằng cách kiểm tra chữ ký (signature) và giải mã payload.
 - Nếu JWT hợp lệ, máy chủ trả về thông tin về người dùng.
 - Cách Thức Hoạt Động của Basic Auth
 - Gửi Thông Tin Đăng Nhập:

 - Người dùng gửi thông tin đăng nhập (username và password) tới máy chủ qua header Authorization của request HTTP.
 - Thông tin đăng nhập được mã hóa dưới dạng base64 và gửi dưới dạng chuỗi base64-encoded.
 4. **Xác Thực Thông Tin Đăng Nhập:**

 - Máy chủ nhận được thông tin đăng nhập từ header Authorization.
 - Máy chủ giải mã thông tin đăng nhập và xác thực người dùng bằng cách so sánh với thông tin trong cơ sở dữ liệu.
 - Nếu thông tin đăng nhập hợp lệ, máy chủ trả về thông tin về người dùng.

## Basic Auth

Basic Auth là một phương pháp authentication đơn giản, thường được sử dụng trong các ứng dụng web và API. Nó hoạt động dựa trên việc gửi tên người dùng và mật khẩu của họ dưới dạng base64-encoded trong header HTTP Authorization. Dưới đây là một số điểm chính về Basic Auth:

- **Đơn Giản:** Basic Auth là một phương pháp đơn giản để xác thực người dùng bằng cách sử dụng tên người dùng và mật khẩu.
- **Không An Toàn:** Mặc dù dễ triển khai, Basic Auth không an toàn vì thông tin xác thực được truyền đi dưới dạng base64-encoded, có thể dễ dàng bị giải mã.

### Cách Thức Hoạt Động của Basic Auth

1. **Gửi Thông Tin Đăng Nhập:**
 - Người dùng gửi thông tin đăng nhập (username và password) tới máy chủ qua header Authorization của request HTTP.
 - Thông tin đăng nhập được mã hóa dưới dạng base64 và gửi dưới dạng chuỗi base64-encoded.
2. **Xác Thực Thông Tin Đăng Nhập:**
 - Máy chủ nhận được thông tin đăng nhập từ header Authorization.
 - Máy chủ giải mã thông tin đăng nhập và xác thực người dùng bằng cách so sánh với thông tin trong cơ sở dữ liệu.
 - Nếu thông tin đăng nhập hợp lệ, máy chủ trả về thông tin về người dùng.

## Token Auth

Token Auth là một phương pháp authentication phổ biến trong các ứng dụng web và API, tương tự như JWT. Nó hoạt động bằng cách gửi một token được tạo ra từ một quá trình xác thực trước đó từ máy khách đến máy chủ để xác thực người dùng. Dưới đây là một số điểm chính về Token Auth

- **Phương Pháp Phổ Biến:** Token Auth là một phương pháp phổ biến và linh hoạt cho việc xác thực người dùng trong các ứng dụng web và API.
- **Tính Bảo Mật:** Token được tạo ra từ quá trình xác thực trước đó, nên có thể được mã hóa và ký để bảo vệ thông tin người dùng.

### Cách Thức Hoạt Động của Token Auth
  1. **Tạo Token:**

  - Người dùng đăng nhập vào hệ thống và cung cấp thông tin đăng nhập.
  - Máy chủ xác thực thông tin đăng nhập và tạo một token.
  - Token có thể được mã hóa và ký (tùy chọn) để bảo vệ thông tin.
  2. **Gửi Token:**

  - Token được trả về cho người dùng sau khi đăng nhập thành công.
  - Người dùng gửi token trong header Authorization của mỗi request tiếp theo đến máy chủ để xác thực.

  3. **Xác Thực Token:**

  - Máy chủ nhận được token từ header Authorization.
  - Máy chủ kiểm tra tính hợp lệ của token bằng cách giải mã và kiểm tra chữ ký (nếu có).
  - Nếu token hợp lệ, máy chủ trả về thông tin về người dùng

## Ưu Điểm và Nhược Điểm

### JWT:
- **Ưu Điểm:** Tính linh hoạt, khả năng mã hóa và ký token.
- **Nhược Điểm:** Kích thước lớn có thể làm tăng kích thước dữ liệu gửi đi.

### Basic Auth:
- **Ưu Điểm:** Đơn giản và dễ triển khai.
- **Nhược Điểm:** Không an toàn, thông tin xác thực được truyền dưới dạng base64-encoded.

### Token Auth:
- **Ưu Điểm:** Phổ biến và bảo mật, có thể mã hóa và ký token.
- **Nhược Điểm:** Đòi hỏi một quá trình xác thực trước đó để tạo ra token.




