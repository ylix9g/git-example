public class Application {

    public static void main(String[] args) {
        // Одной из главных проблем при разработке (в одиночку либо в команде)
        // приложений является контроль версий (история изменений, навигация по
        // истории, сравнение версий между собой, работа с ветками).

        // Git - отдельная программа являющиеся полноценной системой контроля
        // версий. Git позволяет хранить полную историю изменений (какие
        // изменения были внесены, кем и когда), помимо хранения истории Git
        // предоставляет инструментарий для навигации по истории, то есть мы
        // можем откатиться на любой интересующий нас момент времени и
        // посмотреть в каком состоянии был проект. Git отслеживает изменения в
        // рамках репозитория. Один репозиторий может состоять из нескольких
        // параллельных веток каждая из которых создаётся от другой ветки.

        // Репозиторий - каталог по-содержимому которого будет отслеживаться
        // история изменений (зачастую в качестве репозитория выступает
        // основная папка проекта).

        // Ветка - репозиторий находящийся в отдельно взятом состоянии, которое
        // может отличаться от состояния других веток, в одной ветке может быть
        // больше изменений, в другой меньше. Изменения вносимые в одну ветку
        // не будут вноситься в другую до запуска процесса слияния.

        // main             test                dev
        // ver #1           ver #1              ver #1
        //                                      ver #1.1
        //                                      ver #1.2
        //                  ver #1.3 (err)      ver #1.3
        //                                      ver #1.4
        // ver #1.5         ver #1.5            ver #1.5

        // Git это консольная программа работающая основываясь на вводимых
        // командах (с Git можно через терминал). Есть возможность работать с
        // Git через программы с графическим интерфейсом (Git GUI, Github
        // Desktop, IDEA и так далее), но несмотря на множество программ с
        // графическим интерфейсом нужно уметь работать через консольные
        // команды.

        // `git --version` - команда которая должна вывести версию Git
        // установленную на вашем компьютере, если Git не установлен компьютер
        // на невозможность выполнения данной команды.

        // `cd <path>` - данная команда не относится к Git, позволяет перейти
        // в нужный каталог на компьютере для выполнения дальнейших действий
        // относительно этого каталога.

        // `git init` - инициализация пустого репозитория относительно того
        // каталога в котором команда выполняется.

        // `git status` - выводит информацию о состоянии репозитория на момент
        // выполнения команды (текущая ветка, по каким файлам отслеживаются
        // изменения, а по каким нет, действия которые мы можем выполнить с
        // репозиторием и так далее).

        // `git add <files>` - добавляет файлы для дальнейшей фиксации в
        // истории изменений в том состоянии в котором они находились на момент
        // выполнения команды.

        // `git config user.name` - хранит имя разработчика от лица которого
        // вносятся изменения в историю репозитория.

        // `git config user.email` - хранит email разработчика от лица которого
        // вносятся изменения в истории репозитория.

        // `git commit -m <message>` - фиксирует в истории изменения по файлам
        // добавленным ранее через git add от имени разработчика заданного
        // через user.name и user.email с информационным сообщением заданном
        // при выполнении команды.

        // В проекте всегда присутствуют файлы и папки которые не должны
        // попадать в репозиторий. К таким папкам относятся .idea хранящая
        // локальную конфигурацию проекта, папки с проектом в скомпилированном
        // виде, файлы с расширением .iml отвечающие за настройки модуля так же
        // могут отсутствовать в репозитории. В Git можно создать специальный
        // файл `.gitignore` с перечнем тех ресурсов которые не должны быть
        // включены в репозиторий.

        System.out.println("Java Application");
    }
}








