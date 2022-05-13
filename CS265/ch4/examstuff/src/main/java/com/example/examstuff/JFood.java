package com.example.examstuff;

public class JFood implements Cloneable, Comparable<JFood>{

    private int mId;
    private String mName;
    private int mQuantity;
    private double mCalories;
    private String[] mIngredients;

    public JFood(int mId, String mName, int mQuantity, double mCalories, String[] mIngredients) {
        this.mId = mId;
        this.mName = mName;
        this.mQuantity = mQuantity;
        this.mCalories = mCalories;
        this.mIngredients = mIngredients;
    }

    public JFood() {
        this(5, "Ham Sandwich", 1, 141.7, new String[]{"Ham", "Provolone", "Bread"});
    }

    public void setFood(int mQuantity, int mCalories, String[] mIngredients) {
        this.mQuantity = mQuantity;
        this.mCalories = mCalories;
        String[] temp = new String[mIngredients.length];
        System.arraycopy(mIngredients, 0, temp, 0, temp.length);
        this.mIngredients = temp;
    }

    public int getmId() {
        return mId;
    }

    public String getmName() {
        return mName;
    }

    public int getmQuantity() {
        return mQuantity;
    }

    public double getmCalories() {
        return mCalories;
    }

    public String[] getmIngredients() {
        return mIngredients;
    }

    @Override
    public int compareTo(JFood o) {
        if ((this.getmCalories() * this.getmQuantity()) < (o.getmCalories() * o.getmQuantity())) {
            return 1;
        }
        else if ((this.getmCalories() * this.getmQuantity()) == (o.getmCalories() * o.getmQuantity())) {
            return 0;
        }
        else {
            return -1;
        }
    }

    @Override
    public JFood clone() {
        String[] temp = new String[this.mIngredients.length];
        System.arraycopy(mIngredients, 0, temp, 0, temp.length);
        return new JFood(this.getmId(), this.getmName(), this.getmQuantity(), this.getmCalories(), temp);
    }
}
