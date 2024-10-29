    Tóm tắt toàn bộ tính năng của ứng dụng
        Tính năng chung:
            Ứng dụng bao gồm 3 tính năng chính:
                Challenge 1: Chuyển đổi tiền tệ với API ExchangeRate-API.
                Challenge 2_1: Quản lý kho sản phẩm, tìm kiếm và sắp xếp sản phẩm.
                Challenge 2_2: Tìm số bị thiếu trong mảng số nguyên.
            Công nghệ chính sử dụng:
                
                Kotlin cho lập trình ứng dụng Android.
                Retrofit cho việc gọi API và lấy dữ liệu từ nguồn bên ngoài.
                Android UI Components cho việc xây dựng giao diện người dùng tương tác.
                MVC để tách biệt giữa các phần của ứng dụng, giúp dễ bảo trì và mở rộng.

- Challenge 1 : Currency converter(Kotlin-MVC)
    1. Tính năng
        - Chọn loại tiền tệ nguồn và đích từ danh sách các loại tiền.
        - Nhập số tiền cần chuyển đổi.
        - Tính toán và hiển thị số tiền đã được chuyển đổi với định dạng số thập phân.
        - Hiển thị thông báo khi nhập liệu không hợp lệ hoặc gặp sự cố.
    2. Api 
        -  ExchangeRate-API
    3. Cấu trúc mã nguồn
       - Challenge1: Lớp Activity chính hiển thị giao diện người dùng và xử lý các sự kiện.
       - ExchangeController: Xử lý logic chuyển đổi và tương tác với ExchangeRepository.
       - ExchangeRepository: Giao tiếp với API chuyển đổi tiền tệ thông qua Retrofit để lấy tỷ giá hối đoái.
       - ExchangeService: Định nghĩa các API endpoint để truy xuất tỷ giá hối đoái.
    5. Cách sử dụng
       - Chọn loại tiền tệ nguồn và đích từ hai spinner trên màn hình.
       - Nhập số tiền vào ô Amount.
       - Nhấn nút "Convert" để thực hiện chuyển đổi. Kết quả sẽ hiển thị bên dưới.
       - Nút quay lại: Nhấn vào nút quay lại trên góc trái để quay về màn hình trước.
    6. Các công nghệ sử dụng
       - Kotlin: Ngôn ngữ lập trình chính cho ứng dụng.
       - Retrofit: Để gọi API và lấy tỷ giá hối đoái từ ExchangeRate-API.
       - Gson: Để chuyển đổi dữ liệu JSON từ API thành các đối tượng Kotlin.
       - Android UI Components: Spinner, EditText, TextView, Button để tạo giao diện người dùng.
-Challenge 2_1 :
  1. Cấu trúc mã nguồn
      - Challenge2_1: Lớp Activity chính hiển thị giao diện người dùng và xử lý các chức năng liên quan đến tìm kiếm, sắp xếp và tổng hợp thông tin kho.
      - Product: Lớp dữ liệu đại diện cho một sản phẩm với các thuộc tính như tên, giá, và số lượng.
      - ProductAdapter: Adapter cho RecyclerView, dùng để hiển thị danh sách các sản phẩm.
  2. Cách sử dụng
      - Xem danh sách sản phẩm với các thông tin cơ bản bao gồm tên, giá, và số lượng.
      - Tìm kiếm sản phẩm: Nhập tên sản phẩm vào ô tìm kiếm và nhấn nút "Search" để lọc danh sách sản phẩm theo từ khóa.
      - Sắp xếp sản phẩm: Nhấn nút "Sort" để sắp xếp sản phẩm theo giá từ thấp đến cao.
      - Thông tin tổng hợp: Ứng dụng sẽ tự động hiển thị sản phẩm đắt nhất và tổng giá trị kho ngay sau khi mở ứng dụng.
  3. Các công nghệ sử dụng
      - Kotlin: Ngôn ngữ lập trình chính cho ứng dụng.
      - Android UI Components: RecyclerView, EditText, TextView, Button để tạo giao diện người dùng.
      - RecyclerView Adapter: Để quản lý và hiển thị danh sách sản phẩm.
  - Challenge 2_2:

    1. Cấu trúc mã nguồn:

      - Challenge2_2: Lớp Activity chính hiển thị giao diện người dùng và xử lý các chức năng tìm số bị thiếu trong mảng số nguyên.
      - NumberArrayModel: Lớp mô hình thực hiện logic để tìm số bị thiếu trong dãy số liên tiếp từ 1 đến n.
    2. Cách sử dụng:

      - Nhập dãy số nguyên vào ô inputArray, cách nhau bởi dấu phẩy.
      - Nhấn nút "Find Missing" để xác định số bị thiếu trong mảng.
      - Kết quả sẽ được hiển thị trong ô resultText.
      - Nút quay lại: Nhấn vào nút quay lại trên góc trái để trở về màn hình trước.
    3. Các công nghệ sử dụng:

      - Kotlin: Ngôn ngữ lập trình chính cho ứng dụng.
      - Android UI Components: EditText, TextView, Button, ImageButton để tạo giao diện người dùng.
      - Mô hình MVC: Sử dụng mô hình MVC để tổ chức mã nguồn và tách biệt giữa giao diện người dùng và logic xử lý.


