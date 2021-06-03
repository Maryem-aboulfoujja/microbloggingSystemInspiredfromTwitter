/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Features;

import Aggregations.AssociatedList;
import java.util.List;


public class Poll {
    
    private AssociatedList <PollAnswerOption> options;
    private String Question;
    private int duration;
    private List<PollAnswerOption> answers;
    public void compute_percentages(){}

    public Poll(String Question, int duration, List<PollAnswerOption> answers, AssociatedList<PollAnswerOption> options) {
        this.Question = Question;
        this.duration = duration;
        this.answers = answers;
        this.options = options;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<PollAnswerOption> getAnswers() {
        return answers;
    }

    public void setAnswers(List<PollAnswerOption> answers) {
        this.answers = answers;
    }

    public AssociatedList<PollAnswerOption> getOptions() {
        return options;
    }

    public void setOptions(AssociatedList<PollAnswerOption> options) {
        this.options = options;
    }
    

    @Override
    public String toString() {
        return "Poll: \n" + "Question: " + Question + ", duration: " + duration + ", answers: " + answers + '.';
    }
    
  
    @Override
    public boolean equals(Object obj){
        return ((obj != null) && (obj instanceof Poll) && (((Poll)obj).getQuestion()).equals(Question));
    }
    
}
