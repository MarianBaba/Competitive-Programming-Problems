
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Cupboards {
    static class FastReader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public FastReader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public FastReader(String file_name) throws IOException {
            din = new DataInputStream(
                    new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    if (cnt != 0) {
                        break;
                    } else {
                        continue;
                    }
                }
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0,
                    BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }

    public static int lookFor1Right(int[][] arr, int n) {
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i][1] == 1) {
                counter++;
            }
        }
        return counter;
    }

    public static int lookFor0Right(int[][] arr, int n) {
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i][1] == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int lookFor1Left(int[][] arr, int n) {
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == 1) {
                counter++;
            }
        }
        return counter;
    }

    public static int lookFor0Left(int[][] arr, int n) {
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String... strings) throws Exception {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int[][] arr = new int[n][2];

        int countLeft = 0;
        int countRight = 0;
        int sec = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = fr.nextInt();
                if (j == 0 && arr[i][j] == 0) {
                    countLeft++;
                }
                if (j == 1 && arr[i][j] == 0) {
                    countRight++;
                }
            }
        }

        if (countLeft == n || countLeft == 0) {
            if (countRight == n || countRight == 0) {
            } else {
                if (countRight > n / 2) {
                    sec += lookFor1Right(arr, n);
                } else {
                    sec += lookFor0Right(arr, n);
                }
            }
        } else {
            if (countLeft > n / 2) {
                sec += lookFor1Left(arr, n);
                if (countRight == n || countRight == 0) {

                } else {
                    if (countRight > n / 2) {
                        sec += lookFor1Right(arr, n);
                    } else {
                        sec += lookFor0Right(arr, n);
                    }
                }
            } else {
                sec += lookFor0Left(arr, n);
                if (countRight == n || countRight == 0) {

                } else {
                    if (countRight > n / 2) {
                        sec += lookFor1Right(arr, n);
                    } else {
                        sec += lookFor0Right(arr, n);
                    }
                }
            }
        }
        System.out.println(sec);
    }
}