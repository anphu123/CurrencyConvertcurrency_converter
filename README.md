Tổng quan ngắn gọn về ứng dụng
Ứng dụng này bao gồm ba tính năng chính:

Challenge 1: Chuyển đổi tiền tệ sử dụng API ExchangeRate-API, cho phép người dùng chọn loại tiền tệ và nhập số tiền để chuyển đổi.

Challenge 2_1: Quản lý kho sản phẩm, cho phép người dùng tìm kiếm và sắp xếp danh sách sản phẩm, hiển thị thông tin tổng hợp về sản phẩm đắt nhất và tổng giá trị kho.

Challenge 2_2: Tìm số bị thiếu trong mảng số nguyên, giúp người dùng nhập một dãy số và xác định số bị thiếu.

Các bước để xây dựng và chạy ứng dụng

Cài đặt môi trường phát triển:

Đảm bảo bạn đã cài đặt Android Studio và thiết lập SDK Android.
Tạo dự án mới:

Mở Android Studio và tạo một dự án mới với ngôn ngữ Kotlin.
Thêm các dependencies cần thiết:

Trong file build.gradle, thêm các thư viện cần thiết như Retrofit, Gson, v.v.
groovy
Sao chép mã

implementation 'com.squareup.retrofit2:retrofit:2.9.0'

implementation 'com.squareup.retrofit2:converter-gson:2.9.0'

Xây dựng cấu trúc mã nguồn:

Tạo các package cho từng challenge (ví dụ: challenge1, challenge2_1, challenge2_2).

Tạo các lớp Activity, Model, Adapter, Repository và Controller theo mô hình MVC.

Thiết kế giao diện người dùng:

Sử dụng XML để thiết kế giao diện cho từng Activity, bao gồm các thành phần như Spinner, EditText, TextView, Button, RecyclerView.

Lập trình logic ứng dụng:

Viết mã cho các chức năng của từng tính năng, bao gồm xử lý sự kiện, gọi API, và cập nhật giao diện.

Chạy ứng dụng:

Kết nối thiết bị Android hoặc sử dụng trình giả lập để chạy ứng dụng.

Nhấn "Run" trong Android Studio để biên dịch và chạy ứng dụng.
Bất kỳ thách thức hoặc ghi chú
Gọi API: Đảm bảo bạn xử lý các lỗi khi gọi API, chẳng hạn như mạng không khả dụng hoặc dữ liệu không hợp lệ.
Quản lý trạng thái: Trong các tính năng như tìm kiếm và sắp xếp, cần đảm bảo rằng danh sách sản phẩm được cập nhật chính xác mà không làm mất đi trạng thái hiện tại của người dùng.
Giao diện người dùng: Chú ý đến việc thiết kế giao diện người dùng sao cho thân thiện và dễ sử dụng, đặc biệt là với các thành phần tương tác như Spinner và EditText.
Kiểm thử: Kiểm tra kỹ lưỡng các tính năng để đảm bảo không có lỗi xảy ra và trải nghiệm người dùng tốt.
