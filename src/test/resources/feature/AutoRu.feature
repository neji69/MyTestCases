# language: ru
@all
@autoruTest
Функционал: Проверка совпадения количества обьявлений на разных страницах

  @success
  Структура сценария: Выбор конкретного производителя и конкретной модели автомобиля.
    Дано пользователь входит на сайт "https://auto.ru"
    Тогда закрыть всплывающее окно
    Тогда проверить название страницы содержит текст "Авто.ру"
    Затем сохранить количество объявлений выбранной <Марка автомобиля> марки автомобиля и совершить переход кликнув по ней
    Тогда проверить, что количество обьявлений совпадает с количеством на предыдущей страницы
    Затем сохранить количество объявлений выбранной "<Модель автомобиля>" модели автомобиля и совершить переход кликнув по ней
    Тогда проверить, что количество обьявлений на текущей странице совпадает с количеством  на предыдущей страницы

    Примеры:
      | Марка автомобиля | Модель автомобиля |
      | Honda            | Accord            |
      | Lexus            | RX                |
      | Suzuki           | Grand Vitara      |
      | Infiniti         | FX                |