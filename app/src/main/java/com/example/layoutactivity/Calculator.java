package com.example.layoutactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class Calculator extends AppCompatActivity implements View.OnClickListener{

    TextView tv_solution, tv_result;
    Button btn_divide, btn_multiply, btn_minus, btn_plus, btn_equal, btn_decimalPoint;
    Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;
    Calculate cal = new Calculate();


    boolean equalPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        tv_solution = findViewById(R.id.tvSolution);
        tv_result = findViewById(R.id.tvResult);

        btn_divide = findViewById(R.id.btnDivide);
        btn_multiply = findViewById(R.id.btnMultiply);
        btn_minus = findViewById(R.id.btnMinus);
        btn_plus = findViewById(R.id.btnPlus);
        btn_equal = findViewById(R.id.btnEqual);
        btn_decimalPoint = findViewById(R.id.btnDecimalPoint);

        btn_0 = findViewById(R.id.btn0);
        btn_1 = findViewById(R.id.btn1);
        btn_2 = findViewById(R.id.btn2);
        btn_3 = findViewById(R.id.btn3);
        btn_4 = findViewById(R.id.btn4);
        btn_5 = findViewById(R.id.btn5);
        btn_6 = findViewById(R.id.btn6);
        btn_7 = findViewById(R.id.btn7);
        btn_8 = findViewById(R.id.btn8);
        btn_9 = findViewById(R.id.btn9);

        //OnClickListeners
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_0.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_equal.setOnClickListener(this);
        btn_decimalPoint.setOnClickListener(this);

        btn_equal.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                allClear();
                Toast.makeText(Calculator.this, "All Cleared", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        btn_decimalPoint.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if(cal.getDec() == 11){
                    cal.setDec(2);
                } else {
                    cal.setDec(11);
                }
                Toast.makeText(Calculator.this, "Max Decimal Places set to " + cal.getDec(), Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    @Override
    public void onClick(View v) {
        String solution = tv_solution.getText().toString();


//        equalPressed = false;

        switch(v.getId()){
            case R.id.btn1:
                if(equalPressed){ //clears everything and starts a new equation
                    solution = "0";
                    allClear();
                    equalPressed = false;
                }
                if (solution.length() == 1 && solution.equals("0")) {
                    tv_solution.setText("1");
                } else if (cal.temp.equals("0") && solution.length()>1) {
                    tv_solution.setText(solution.substring(0,solution.length()-1));
                    tv_solution.append("1");
                } else {
                    tv_solution.append("1");
                }
                cal.temp += "1";

                break;

            case R.id.btn2:
                if(equalPressed){
                    solution = "0";
                    allClear();
                    equalPressed = false;
                }
                if (solution.length() == 1 && solution.equals("0")) {
                    tv_solution.setText("2");
                } else if (cal.temp.equals("0") && solution.length()>1) {
                    tv_solution.setText(solution.substring(0,solution.length()-1));
                    tv_solution.append("2");
                } else {
                    tv_solution.append("2");
                }
                cal.temp += "2";
                break;

            case R.id.btn3:
                if(equalPressed){
                    solution = "0";
                    allClear();
                    equalPressed = false;
                }
                if (solution.length() == 1 && solution.equals("0")) {
                    tv_solution.setText("3");
                } else if (cal.temp.equals("0") && solution.length()>1) {
                    tv_solution.setText(solution.substring(0,solution.length()-1));
                    tv_solution.append("3");
                } else {
                    tv_solution.append("3");
                }
                cal.temp += "3";
                break;

            case R.id.btn4:
                if(equalPressed){
                    solution = "0";
                    allClear();
                    equalPressed = false;
                }
                if (solution.length() == 1 && solution.equals("0")) {
                    tv_solution.setText("4");
                } else if (cal.temp.equals("0") && solution.length()>1) {
                    tv_solution.setText(solution.substring(0,solution.length()-1));
                    tv_solution.append("4");
                } else {
                    tv_solution.append("4");
                }
                cal.temp += "4";
                break;

            case R.id.btn5:
                if(equalPressed){
                    solution = "0";
                    allClear();
                    equalPressed = false;
                }
                if (solution.length() == 1 && solution.equals("0")) {
                    tv_solution.setText("5");
                } else if (cal.temp.equals("0") && solution.length()>1) {
                    tv_solution.setText(solution.substring(0,solution.length()-1));
                    tv_solution.append("5");
                } else {
                    tv_solution.append("5");
                }
                cal.temp += "5";
                break;

            case R.id.btn6:
                if(equalPressed){
                    solution = "0";
                    allClear();
                    equalPressed = false;
                }
                if (solution.length() == 1 && solution.equals("0")) {
                    tv_solution.setText("6");
                } else if (cal.temp.equals("0") && solution.length()>1) {
                    tv_solution.setText(solution.substring(0,solution.length()-1));
                    tv_solution.append("6");
                } else {
                    tv_solution.append("6");
                }
                cal.temp += "6";
                break;

            case R.id.btn7:
                if(equalPressed){
                    solution = "0";
                    allClear();
                    equalPressed = false;
                }
                if (solution.length() == 1 && solution.equals("0")) {
                    tv_solution.setText("7");
                } else if (cal.temp.equals("0") && solution.length()>1) {
                    tv_solution.setText(solution.substring(0,solution.length()-1));
                    tv_solution.append("7");
                } else {
                    tv_solution.append("7");
                }
                cal.temp += "7";
                break;

            case R.id.btn8:
                if(equalPressed){
                    solution = "0";
                    allClear();
                    equalPressed = false;
                }
                if (solution.length() == 1 && solution.equals("0")) {
                    tv_solution.setText("8");
                } else if (cal.temp.equals("0") && solution.length()>1) {
                    tv_solution.setText(solution.substring(0,solution.length()-1));
                    tv_solution.append("8");
                } else {
                    tv_solution.append("8");
                }
                cal.temp += "8";
                break;

            case R.id.btn9:
                if(equalPressed){
                    solution = "0";
                    allClear();
                    equalPressed = false;
                }
                if (solution.length() == 1 && solution.equals("0")) {
                    tv_solution.setText("9");
                } else if (cal.temp.equals("0") && solution.length()>1) {
                    tv_solution.setText(solution.substring(0,solution.length()-1));
                    tv_solution.append("9");
                } else {
                    tv_solution.append("9");
                }
                cal.temp += "9";
                break;

            case R.id.btn0:
                if(equalPressed){
                    solution = "0";
                    allClear();
                    equalPressed = false;
                }
                
                if (solution.length()==1 && solution.equals("0")) {
                    tv_solution.setText("0");
                    cal.temp = "0";
                    
                } else if (cal.temp.equals("0") && solution.length()>1){
                    cal.temp = "0";
                    
                } else {
                    tv_solution.append("0");
                    cal.temp += "0";
                }
                break;

            case R.id.btnDecimalPoint:
                if(equalPressed){
                    solution = "0";
                    allClear();
                    equalPressed = false;
                }
                char lastChar = 'z';
                if(cal.temp.length()>0)
                    lastChar = cal.temp.charAt(cal.temp.length()-1);

                if (!cal.temp.contains(".")){ //if string doesn't contain decimal point

                    if (cal.temp.equals("")){ //if string is empty
                        cal.temp += "0."; //add 0.
                        if(!solution.equals("0"))
                            tv_solution.append("0.");
                        else
                            tv_solution.append(".");

                    } else {
                        cal.temp += "."; //add .
                        tv_solution.append(".");
                    }


                } else if (cal.temp.contains(".") && lastChar == '.') { //if string contains '.' && last index is '.'
                    cal.temp = cal.temp.replace(".", ""); //remove '.'
                    tv_solution.setText(solution.replace(".", ""));

                }
//                Toast.makeText(this, cal.temp, Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnDivide:
                if(equalPressed){
                    String tempEq = Double.toString(cal.getFinalResult());
                    if(tempEq.endsWith(".0"))
                        tempEq = tempEq.replace(".0", "");

                    tv_solution.setText(tempEq);
                    solution = "0";
                    cal.numbers.clear();
                    cal.numbers.add(cal.getFinalResult());
                    cal.signs.clear();
                    equalPressed = false;
                }
                if(lastIsOperation(solution)){ //changes the sign to divide if there is an existing sign
                    StringBuilder sb = new StringBuilder(solution);
                    sb.setCharAt(solution.length()-1, '\\');
                    tv_solution.setText(sb.toString());
                    cal.signs.set(cal.signs.size()-1, "\\");
                }else if (solution.charAt(solution.length()-1) != '\\'){ //append divide sign if last char is not divide sign
                    tv_solution.append("\\");
                    cal.signs.add("\\");
                    cal.temp = "";
                    if(cal.numbers.size() == 0){
                        cal.numbers.add((double) 0);
                    }
                }

                break;

            case R.id.btnMultiply:
                if(equalPressed){
                    String tempEq = Double.toString(cal.getFinalResult());
                    if(tempEq.endsWith(".0"))
                        tempEq = tempEq.replace(".0", "");
                    tv_solution.setText(tempEq);
                    solution = "0";
                    cal.numbers.clear();
                    cal.numbers.add(cal.getFinalResult());
                    cal.signs.clear();
                    equalPressed = false;
                }

                if(lastIsOperation(solution)){
                    StringBuilder sb = new StringBuilder(solution);
                    sb.setCharAt(solution.length()-1, '*');
                    tv_solution.setText(sb.toString());
                    cal.signs.set(cal.signs.size()-1, "*");

                }else if (solution.charAt(solution.length()-1) != '*'){
                    tv_solution.append("*");
                    cal.signs.add("*");
                    cal.temp = "";
                    if(cal.numbers.size() == 0){
                        cal.numbers.add((double) 0);
                    }
                }
                break;

            case R.id.btnMinus:
                if(equalPressed){
                    String tempEq = Double.toString(cal.getFinalResult());
                    if(tempEq.endsWith(".0"))
                        tempEq = tempEq.replace(".0", "");
                    tv_solution.setText(tempEq);
                    solution = "0";
                    cal.numbers.clear();
                    cal.numbers.add(cal.getFinalResult());
                    cal.signs.clear();
                    equalPressed = false;
                }
                if(lastIsOperation(solution)){
                    StringBuilder sb = new StringBuilder(solution);
                    sb.setCharAt(solution.length()-1, '-');
                    tv_solution.setText(sb.toString());
                    cal.signs.set(cal.signs.size()-1, "-");
                }else if (solution.charAt(solution.length()-1) != '-'){
                    tv_solution.append("-");
                    cal.signs.add("-");
                    cal.temp = "";
                    if(cal.numbers.size() == 0){
                        cal.numbers.add((double) 0);
                    }
                }
                break;

            case R.id.btnPlus:
                if(equalPressed){
                    String tempEq = Double.toString(cal.getFinalResult());
                    if(tempEq.endsWith(".0"))
                        tempEq = tempEq.replace(".0", "");

                    tv_solution.setText(tempEq);
                    solution = "0";
                    cal.numbers.clear();
                    cal.numbers.add(cal.getFinalResult());
                    cal.signs.clear();
                    equalPressed = false;

                }
                if(lastIsOperation(solution)){
                    StringBuilder sb = new StringBuilder(solution);
                    sb.setCharAt(solution.length()-1, '+');
                    tv_solution.setText(sb.toString());
                    cal.signs.set(cal.signs.size()-1, "+");
                }else if (solution.charAt(solution.length()-1) != '+'){
                    tv_solution.append("+");
                    cal.signs.add("+");
                    cal.temp = "";
                    if(cal.numbers.size() == 0){
                        cal.numbers.add((double) 0);
                    }
                }
                break;

            case R.id.btnEqual:
                equalPressed = true;
                break;

            default:
                tv_result.setText("Error");
                tv_solution.setText("Error");
        }

        if(!equalPressed){ //if equals is NOT pressed

            if (cal.temp.isEmpty()){//don't do anything below if there is no new number typed
                cal.setSeqResult(cal.getResult());
                return;
            }

            if(cal.numbers.size() == cal.signs.size()){ //for adding new numbers to the array if sizeof s === n

                cal.numbers.add(Double.parseDouble(cal.temp)); //add a new number to array
                cal.sequenceCalculate(); //calculate right away after adding another number


                String tempRes = Double.toString(cal.getResult());
                if(tempRes.endsWith(".0")){
                    tempRes = tempRes.replace(".0", "");
                }

                tv_result.setText(tempRes);


            } else if(cal.numbers.size() > cal.signs.size()) { //edit last number of the array if size of numbers > signs

                cal.numbers.set(cal.numbers.size()-1, Double.parseDouble(cal.temp)); //this is for incomplete next numbers
                cal.sequenceCalculate();

                String tempRes = Double.toString(cal.getResult());
                if(tempRes.endsWith(".0")){
                    tempRes = tempRes.replace(".0", "");
                }

                tv_result.setText(tempRes);
            }


        } else { //calculate the equation as a whole using pemdas

            if(cal.numbers.size() == cal.signs.size()) //remove the last sign if last char of equation is a sign
                cal.signs.remove(cal.signs.size()-1);

            cal.calculate();

            String tempRes = Double.toString(cal.getFinalResult());
            if(tempRes.endsWith(".0")){
                tempRes = tempRes.replace(".0", "");
            }

            tv_result.setText(tempRes);
        }
    }

    private boolean lastIsOperation(String text){ //checks if the last character of the solution is an operation
        char c = text.charAt(text.length()-1);
        return c == '\\' || c == '*' || c == '+' || c == '-';
    }

//    private boolean containsOperation(String text){
//        return text.contains("\\") || text.contains("*") || text.contains("-") || text.contains("+");
//    }
//
//    //only use if the string contains an operation
//    private int searchLastOperation(String text){ //return index of the last operation used
//        int div = text.lastIndexOf("\\");
//        int mult = text.lastIndexOf("*");
//        int min = text.lastIndexOf("-");
//        int plus = text.lastIndexOf("+");
//
//        int max = div;
//        if (mult > max) max = mult;
//        if (min > max) max = min;
//        if (plus > max) max = plus;
//        return max;
//    }

    public void allClear(){
        cal.numbers.clear();
        cal.signs.clear();
        cal.temp = "";
        cal.setSeqResult(0);
        cal.setFinalResult(0);
        tv_result.setText("0");
        tv_solution.setText("0");
    }

}