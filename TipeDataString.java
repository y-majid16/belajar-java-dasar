public class TipeDataString {
    public static void main(String[] args) {
        String name = "Nama Saya";
        String firstName = "\'Yaumul";
        String lastName = "Majid\'";

        System.out.println(name);
        // Menggabungkan String
        // System.out.println(firstName);
        // System.out.println(lastName);

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        String story = """
            <html>
            <head>
              <title>Belajar Java dasar</title>
            </head>
            <body>
              <h1>Halo, selamat belajar Java</h1>
            </body>
          </html>
                """;
        System.out.println(story);
    }
}
