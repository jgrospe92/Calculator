
public class Calculator {

    public int calculate(String data) throws Exception {
        if (data == null || data.length() == 0)
            return 0;

        QueueImp<Character> queueStack = new QueueImp();

        for (int i = 0; i < data.length(); i++) {
            queueStack.enqueue(data.charAt(i));
        }
        queueStack.enqueue('+');
        return calculate(queueStack);
    }

    public int calculate(QueueImp<Character> queueStack) throws Exception {
        int num = 0;

        StackImp st = new StackImp<>();
        int prevSign = '+';

        while (!queueStack.isEmpty()) {
            char ch = queueStack.dequeue();

            if (ch == ' ')
                continue;

            else if (Character.isDigit(ch)) {
                num = num * 10 + ch - '0';
            } else if (ch == '(') {
                num = calculate(queueStack);
            } else {
                if (prevSign == '+') {
                    st.push(num);
                } else if (prevSign == '-') {
                    st.push(-1 * num);
                } else if (prevSign == '*') {
                    st.push((int) st.pop() * num);
                } else if (prevSign == '/') {
                    st.push((int) st.pop() / num);
                }

                num = 0;
                prevSign = ch;
                if (ch == ')')
                    break;
            }
        }

        int sum = 0;
        while (!st.isEmpty())
            sum += (int) st.pop();
        return sum;
    }


}
