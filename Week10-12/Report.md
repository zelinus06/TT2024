# Report tuần 8

## Logging

### Tổng quan
1. **Khái niệm**
 - Log là một quá trình ghi lại những thông tin được thông báo, lưu lại trong quá trình hoạt động của một ứng dụng ở một nơi tập trung.
 - Mục đích chính là để có thể xem lại các thông tin hoạt động của ứng dụng trong quá khứ như debug khi có lỗi xảy ra, check health, xem info, error, warning,…
 - Phân loại log:
  + All: đây là cấp độ thấp nhất, Logger và Appender được định nghĩa với cấp độ này, mọi thông tin cần log sẽ được log.
  + Debug: Các thông tin dùng để debug
  + Info: Các thông tin muốn ghi nhận thêm trong quá trình hoạt động
  + Warning: thông tin cảnh báo
  + Error: các lỗi khi chạy chương trình
  + Fatal: các lỗi nghiêm trọng xảy ra
  + Off: cấp độ cao nhất sử dụng khi không muốn log bất kì thông tin nào

2. **Tác dụng**
 - Giúp theo dõi dòng chảy của chương trình
 - Nắm bát bất kỳ lỗi nào có thể xảy ra
 - Cung cấp hỗ trợ chẩn đoán và gỡ lỗi

3. **Logger**
 - Logger là công cụ được sử dụng để ghi log. Trong Java, một thư viện phổ biến được sử dụng để logging là java.util.logging.
 - Thông tin được ghi vào một file log hoặc cơ sở dữ liệu tùy thuộc vào cấu hình logger
4. **Handlers
 - Là thành phần xác định nơi mà bản ghi log được gửi đến
5. **Formatter*
 - Formatter được sử dụng để định dạng các bản ghi log trước khi chúng được ghi vào các nguồn như console, file, hoặc cơ sở dữ liệu.
 - Formatter cho phép bạn tùy chỉnh cách mà thông tin trong mỗi bản ghi log được hiển thị, bao gồm cả thời gian, mức độ log, tên logger, và nội dung của thông điệp.

## GraphQl
### Tổng quan
 - là một ngôn ngữ truy vấn cho api cung cấp mô tả hoàn chỉnh cho dữ liệu trong API
 - Cung cấp một interface chung giữa client và server cho việc lấy và thao tác với dữ liệu.
 - GraphQL sử dụng một query để thực thi hành động, lấy dữ liệu từ server

### Tiện ích
 - Declarative: Với GraphQL, bạn tự định nghĩa ra những dữ liệu bạn cần.
 - Hierarchical: Với mỗi request, bạn có thể lấy được một object và cả những object liên quan với object đó, ví dụ một Author cùng với các Posts mà người đó tạo ra, mà các Comments trên mỗi Post.
 - Strongly-typed: Với hệ thống GraphQL, ta có thể mô tả dữ liệu có thể truy vấn từ server dựa trên kiểu của object và dữ liệu trả về sẽ phù hợp với kiểu object chỉ định trong câu truy vấn.
 - Not Language specific:** GraphQL không gắn với một ngôn ngữ lập trình cụ thể nào cả.
 - Compatible with any backend: GraphQL không bị giới hạn bởi một data storage cụ thể; bạn có thể sử dụng data và code có sẵn, kể cả kết nối đến third-party APIs.
 - Introspective: một GraphQL server có thể được truy vấn về schema cụ thể của nó.

### Các thành phần của GraphQL query
- Fields là thành phần cơ bản của một object mà ta muốn thu được từ server.
- Argument: Tham số truyền vào của query
- Variables: biến của câu query trước tên biến có dấu $
- Aliases: Aliases trong GraphQL cho phép đặt tên cho các trường hoặc các khối truy vấn để sử dụng trong câu truy vấn. Điều này hữu ích khi bạn muốn lấy dữ liệu từ cùng một trường nhiều lần hoặc khi bạn muốn truy vấn nhiều trường cùng một lúc từ cùng một loại.
- Fragments: Fragments là một tập hợp các fields có thể sử dụng lại và include vào query khi cần thiết.
- Directives: Directives cho phép ta thay đổi cấu trúc query một cách linh hoạt sử dụng các biến. GraphQL có 2 directive:
  + @include sẽ include một field hay fragment khi tham số if là true.
  + @skip sẽ bỏ qua một field hay fragment khi tham số if là false.
  + Cả hai directive nhận tham số kiểu boolean.
- Mutation: Mutations được sử dụng để thực hiện hành động write. Thay đổi, cập nhật dữ liệu trên server. Tương tự các phương thức post, patch, put, delete trong restfulApi.
- Schemas:
 + Schemas mô tả cách dữ liệu được tổ chức và những dữ liệu nào có thể được truy vấn. 
 + Schemas cung cấp các kiểu object được sử dụng. GraphQL schema quy định kiểu chặt chẽ, mọi object trong schema phải được chỉ định kiểu. 
 + Kiểu được sử dụng để xác định một truy vấn có hợp lệ hay không.

## MongoDB
### Tổng quan
1. **Khái niệm**
 - MongoDB là một cơ sở dữ liệu mã nguồn mở và là cơ sở dữ liệu NoSQL(*) hàng đầu, được hàng triệu người sử dụng. MongoDB được viết bằng C++.
 - Ngoài ra, MongoDB là một cơ sở dữ liệu đa nền tảng, hoạt động trên các khái niệm Collection và Document.
 - Kho lưu định hướng Document: Dữ liệu được lưu trong các tài liệu kiểu JSON.
2. **Các thành phần trong MongoDB:**
  + id: Là trường bắt buộc có trong document, đại diện cho giá trị duy nhất trong document MongoDB
  + Collection: nhóm của nhiều document trong MongoDB tương ứng với bảng trong cơ sở dữ liệu RDBMS
  + Cursor: COn trỏ đến tập kết quả của một truy vấn.
  + Database: Nơi chứa các Collection
  + Document: Một bản ghi thuộc một Collection thì được gọi là một Document. Gồm các trường tên và giá trị
  + Field: Là một cặp name-value trong một document
  + Index: Cấu trúc dữ liệu đặc biệt để chứa một phần nhỏ của các tập dữ liệu một cách dễ dàng để quét

3. **Cách thức hoạt động của MongoDB**
 - MongoDB hoạt động dưới một tiến trình ngầm service(cổng mặc định 27017) để lắng nghe các yêu cầu truy vấn, thao tác từ ứng dụng gửi vào để tiến hành xử lý.
 - Mỗi document của MongoDB được tự động gắn thếm field có tên "_id" để xác định tính duy nhất của document này so với document khác cũng như phục vụ thao tác tìm kiếm và truy vấn thông tin về sau.
 - Mỗi khi có truy vấn, document được cache ghi lên bộ nhớ Ram để phục vụ lượt truy ván sau diễn ra nhanh hơn mà không cần phải đọc ổ cứng
 - Khi có yêu cầu thêm/sửa/xóa document, để đảm bảo hiệu suất thì mặc định MongoDB sẽ chưa cập nhật xuống ổ cứng ngay mà sau 60s thì mới thực hiện ghi toan bộ dữ liệu thay đổi từ RAM xuống ổ cứng.

### Sự khác biệt giữa MongoDB và RDBMS
1. **Ưu điểm của MongoDB**
 - MongoDB sử dụng cơ sở dữ liệu dựa trên document. Số trường, nội dung và kích cỡ của Document này có thể khác với Document khác. Khả năng sử dụng linh hoạt
 - Không có các join phức tạp
 - Khả năng truy vấn sâu hơn. MongoDB hỗ trợ cá truy vấn động trên các Document
 - Dễ dàng mở rộng theo chiều ngang.
 - Không cần thiết chuyển đổi ánh xạ các đối tượng ứng dụng đến đối tượng cơ sở dữ liệu.
2. **Nhược điểm của MongoDB**
 - MongoDB không phù hợp với các ứng dụng cần tính toàn vẹn và nhất quán của dữ liệu, ví dụ trong banking
 - MongoDB không có tính ràng buộc nên cần cẩn thận khi thao tác trên các collection có quan hệ dữ liệu với nhau
 - Khả năng xử lý giao dịch phức tạp không bằng RDBMS

### Một số lệnh sử dụng trong MongoDB
 - Hiển thị tất cả database: show dbs
 - Tạo database: use 'database name'
 - Liệt kê các Collection; show collections
 - Tạo một collection và insert dữ liệu vào collection: db.collection_name.insert({'key_name': 'value'})
 - Xóa collection: db.collection_name.drop()
 - Truy vấn tất cả object của một collection: db.collection_name.find({})
 - Chèn một document: db.mycollection.insertOne({ name: "value", age: value})
 - Tìm document: db.mycollection.find({ age: { $gt: 20 } })  # Tìm tất cả những người có tuổi lớn hơn 20

## ElasticSearch, OpenSearch
### ElasticSearch
1. **Khái niệm**
 - Elasticsearch là một open source serch engine có khả năng highly scalable.
 - Nó cho phép chúng ta lưu trữ, phân tích một lượng lớn thông tin realtime.
 - Elasticsearch làm việc với JSON documents files. Sử dụng internal structure đặc trưng, nó có thể parse data của bạn một cách realtime và có thể search mọi thông tin mà bạn muốn

2. **Thành phần cơ bản**
 - Cluster: Là một tập hợp gồm một hoặc nhiều nodes, đồng thời, chúng sẽ lưu trữ thông tin. Nó cung cấp khả năng lập chỉ mục (index) và tìm kiếm theo node và được xác định bằng một unique name
 - Node: là một single server có thể thực hiện lưu trữ dữ liệu và tham gia thực hiện tìm kiếm và đánh index của cluster.
 - Document: là đơn vị dữ liệu cơ bản trong ElasticSearch - đối tượng JSON với một số dữ liệu cụ thể. Mỗi document thuộc một type và nằm trong một chỉ mục. Mỗi document được liên kết với một định danh duy nhất được gọi là UID.
 - Type: sử dụng làm danh mục của chỉ mục, cho phép lưu trữ các loại dữ liệu khác nhau trong cùng một chỉ mục.
 - Shard: mỗi shard chứa tất cả các thuộc tính của document nhưng chứa ít đối tượng JSON hơn index. Một node có nhiều shard và đóng vai trò lưu trữ dữ liệu. Có 2 loại là primary shard và replica shard.

3. **Cách thức hoạt động**
 - Loại bỏ những từ ít ý nghĩa trong document như a, an, every, for, the,...Các từ quan trọng được giữ lại và lưu trữ(term). Vị trí lưu trữ sẽ có dạng document:position
 - Khi có truy vấn full text-search. Từ tìm kiếm cũng được tách ra thành từng term tương ứng. Dựa vào bảng Inverted index đã lập từ trước với các document. Các term trong full-text search sẽ được tìm thấy với các vị trí tương ứng (document:position). Kết hợp tất cả các kết quả vị trí của từng term, ta được vị trí tìm thấy trong document nào.
 - Việc phân tách ra thành các term được thực hiện bởi Tokenizer, bởi vì cách tách từ như thế nào, tách hết hay phân biệt từ đơn, từ phức, tên riêng,... sẽ ảnh hưởng đến việc truy vấn của chúng ta

### OpenSearch
1. **Khái niệm OpenSearch**
 - OpenSearch là một bộ công cụ tìm kiếm và phân tích phân tán, hướng tới cộng đồng, được cấp phép của Apache 2.0, 100% nguồn mở được sử dụng cho hàng loạt các trường hợp như giám sát ứng dụng theo thời gian thực, phân tích bản ghi và tìm kiếm trang web.
 - Năm 2021, Elastic NV thông báo sẽ không phát hành các phiên bản mới của elasticsearch theo giấy phép Apache 2.0 thay vào đó là dùng giấy phép SSPL và nó không phải là nguồn mở. Chính vì vậy, opensearch là một nhánh rẽ từ phiên bản Alv2 mới nhất của ElasticSearch.

2. **Một số tính năng cung cấp**
 - Bảo mật nâng cao: Cung cấp các tính năng mã hóa, xác thực, ủy quyền và kiểm tra
 - Tính năng tìm kiếm tích hợp sẵn: Cung cấp hàng loạt các tính năng để giúp bạn tùy chỉnh trải nghiệm tìm kiếm của mình
 - Cú pháp truy vấn SQL: Cung cấp cú pháp truy vấn SQL quen thuộc
 - Data Prepper: Data Prepper là bộ thu thập dữ liệu phía máy chủ có khả năng lọc, làm phong phú, chuyển đổi, chuẩn hóa và tổng hợp dữ liệu để phân tích và trực quan hóa hạ nguồn

