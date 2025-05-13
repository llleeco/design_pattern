package command;

@FunctionalInterface // 추가 메서드를 정의 못하게 해줌, 메서드가 1개만 들어가도록
public interface Command {
    void execute();
}
