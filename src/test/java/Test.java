
import main.java.Colas;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Test {
    Colas<String> q;
    Colas<Integer> q2;
}

public void SetUp() throws Exception{
    this.q = new ColasI <String> (len:5);
    this.q.push (e: "1");
    this.q.push (e: "2");
    this.q.push (e: "3");

}
