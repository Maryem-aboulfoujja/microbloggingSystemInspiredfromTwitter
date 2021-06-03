/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Features;


public class PollAnswerOption {
    private String option;
    private int answers;
    public void choose_answer(){}

    public PollAnswerOption(String option, int answers) {
        this.option = option;
        this.answers = answers;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public int getAnswers() {
        return answers;
    }

    public void setAnswers(int answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "PollAnswerOption: \n" + "option: " + option + ", answers: " + answers + '.';
    }
    
}
