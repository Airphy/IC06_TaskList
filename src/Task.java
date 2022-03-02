import java.io.Serializable;
import java.util.Objects;

public class Task implements Serializable {

    private String mName, mDueDate, mDeadLine;
    private int mPriority;


    public Task(String mName, String mDueDate, String mDeadLine, int mPriority) {
        this.mName = mName;
        this.mDueDate = mDueDate;
        this.mDeadLine = mDeadLine;
        this.mPriority = mPriority;
    }
    public Task(Task otherTask) {
        mName = otherTask.mName;
        mDueDate = otherTask.mDueDate;
        mDeadLine = otherTask.mDeadLine;
        mPriority = otherTask.mPriority;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getDueDate() {
        return mDueDate;
    }

    public void setDueDate(String mDueDate) {
        this.mDueDate = mDueDate;
    }

    public String getDeadLine() {
        return mDeadLine;
    }

    public void setDeadLine(String mDeadLine) {
        this.mDeadLine = mDeadLine;
    }

    public int getPriority() {
        return mPriority;
    }

    public void setPriority(int mPriority) {
        this.mPriority = mPriority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return mPriority == task.mPriority && Objects.equals(mName, task.mName) && Objects.equals(mDueDate, task.mDueDate) && Objects.equals(mDeadLine, task.mDeadLine);
    }

    @Override
    public String toString() {
        String priorityText = "";
        switch(mPriority)
        {
            case 1:
                //High
                priorityText = "High";
                break;
            case 2:
                priorityText = "Medium";
                break;
            case 3:
                //Low
                priorityText = "Low";
                break;
        }

        return "Task[" +
                "Name= " + mName  +
                ", DueDate= " + mDueDate  +
                ", DeadLine= " + mDeadLine  +
                ", Priority= " + priorityText +
                ']';
    }
}
