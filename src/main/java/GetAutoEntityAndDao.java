import org.mybatis.generator.api.ShellRunner;

public class GetAutoEntityAndDao {
    public static void main(String[] args) {
        args = new String[] { "-configfile", "src/main/resources/mybatis-generator.xml", "-overwrite" };
        ShellRunner.main(args);
    }
}
