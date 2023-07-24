package Program;

import javax.xml.stream.events.Comment;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class post {
    public Date moment;

    public String content;
    public Integer likes;

    public List<comntarios> commentList = new ArrayList<comntarios>();
    //isso acima e uma acossiação de 1 para muitos!!!

    public post(Date moment, String content, Integer likes) {
        this.moment = moment;
        this.content = content;
        this.likes = likes;
    }

    public post() {
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<comntarios> getCommentList() {
        return commentList;
    }

    public void ADDcomennt(comntarios comment) {
        commentList.add(comment);

    }

    public void Removecomennt(Comment comment) {
        commentList.remove(comment);

    }
    public  String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append(content +"/n"+likes);
        sb.append(likes);
        sb.append(" likes - ");
        sb.append(getMoment());
        return sb.toString();
    }
}

