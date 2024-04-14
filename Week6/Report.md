# Unit testing
 - unit test là một loại kiểm thử phần mềm trong đó thực hiện kiểm thử từng đơn vị hoặc thành phần riêng lẻ của phần mềm
 - Mục đích của việc Kiểm thử đơn vị là để xác nhận rằng của mỗi đơn vị hay mã code của phần mềm thực hiện chức năng của chúng đúng như mong đợi
## Tác dụng
 - Kiểm thử đơn vị giúp sửa lỗi sớm trong chu kỳ phát triển phần mềm, từ đó giúp tiết kiệm thời gian và chi phí
 - Giúp các kỹ sư phần mềm hiểu cơ sở code và cho phép họ thực hiện các thay đổi nhanh chóng
 - Kiểm thử đơn vị có thể được dùng như tài liệu dự án

# Func testing
 - là một loại kiểm thử phần mềm nhằm kiểm tra, đảm bảo hệ thống phần mềm hiển thị, hoạt động đúng với các yêu cầu / thông số kỹ thuật chức năng được xác định ban đầu
 - là một loại kiểm thử hộp đen. Không quan tâm đến source code ứng dụng

## Tác dụng
- Chức năng dòng chính (Mainline functions): Kiểm tra các luồng hoạt động chính của ứng dụng, trang web.
- Khả năng sử dụng cơ bản (Basic Usability): Liên quan đến việc kiểm tra khả năng sử dụng cơ bản của hệ thống. Kiểm tra xem người dùng có thể thao tác, điều hướng qua lại giữa các màn hình có gặp bất kỳ khó khăn nào hay không.
- Khả năng truy cập (Accessibility): Kiểm tra khả năng truy cập của hệ thống dành cho người dùng
- Điều kiện lỗi (Error Conditions): Sử dụng các kỹ thuật thử nghiệm để kiểm tra các điều kiện lỗi. Kiểm tra xem các thông báo lỗi phù hợp có được hiển thị hay không.

# Integration test
- là một giai đoạn trong kiểm thử phần mềm. Mỗi môđun phần mềm riêng biệt được kết hợp lại và kiểm thử theo nhóm.

## Tác dụng
- Các Module được thiết kế bởi các lập trình viên khác nhau. Kiểm thử tích hợp là cần thiết để đảm bảo tính hợp nhất của phần mềm.
- Tại thời điểm phát triển module vẫn có thể có thay đổi, những thay đổi này có thể không được kiểm tra ở giai đoạn unit test trước đó.
- Giao diện và cơ sở dữ liệu của các module có thể chưa hoàn chỉnh khi được ghép lại.
- Khi tích hợp hệ thống các module có thể không tương thích với cấu hình chung của hệ thống.
- Thiếu các xử lý ngoại lệ có thể xảy ra.

# Load/Stress Test
- Là 2 loại kiểm tra hiệu năng ứng dụng theo cách khác nhau
- Load test: Kiểm tra bằng tăng tải liên tục và đều đặn cho tới khi đạt đến breakpoint
- Stress test: Kiểm tra bằng cách đặt một lượng người dùng truy cập vượt quá khả năng của hệ thống, vượt ngưỡng breakpoint

## Tác dụng
### Load test
- Phơi bày các khiếm khuyết của một ứng dụng liên quan đến lỗi tràn bộ đệm, rò rỉ bộ nhớ và quản lý sai bộ nhớ
- Các vấn đề cuối cùng sẽ xuất hiện do thử nghiệm tải có thể bao gồm các vấn đề cân bằng tải, vấn đề băng thông, công suất của hệ thống hiện tại,..

### Stress test
-Kiểm tra khả năng chịu đựng của hệ thống và cách xử lí, hành vi của hệ thống khi có một lượng truy cập đột ngột tăng cao

# Redis
- là hệ thống lưu trữ dữ liệu in-memory dưới dạng key-value với tốc độ nhanh, mã nguồn mở, được sử dụng để lưu trữ dữ liệu, cache, message broker và queue.
## Ứng dụng
- Caching: triển khai in-memory cache để giảm độ trễ truy cập dữ liệu, tăng thông lượng và giảm tải khỏi cơ sở dữ liệu quan hệ trong chương trình
- lưu trữ dữ liệu trong bộ nhớ với tính sẵn sàng cao và bền bỉ