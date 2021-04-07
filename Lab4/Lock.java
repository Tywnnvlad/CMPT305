/**
 * @author Gregory Cal
 * @since April 6, 2021
 * @version 1.0
 * 
 * 
 * 
 * This class will create a Lock object that will create a lock with LockUI and password
 */
public class Lock {
        private static LockUI lockui;
        private static String password;

        public Lock() {
                this.lockui = new LockUI();
                this.password = "1111";
        }

        public static void main(String[] args) {
                Lock vvv = new Lock();
             }

        public static String getPassword(){
                return password;
        }
}