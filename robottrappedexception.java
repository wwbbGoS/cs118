public class RobotTrappedException extends IllegalStateException{
        public RobotTrappedException() {
        	super();
        }

        public RobotTrappedException(String s) {
        	super(s);
        }

        public RobotTrappedException(String message, Throwable cause) {
        	super(message, cause);
        }

        public RobotTrappedException(Throwable cause){
        	super(cause);
        }

}