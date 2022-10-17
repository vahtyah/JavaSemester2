package src.lab_24.task_3;

public class task_3 {
    public interface IDocument{
        public Object NewFile();

    }
    public interface ICreateDocument{
        abstract IDocument CreateNew();
        abstract IDocument CreateOpen();
    }
    public class TextDocument{

    }
}
