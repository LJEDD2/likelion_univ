# Week 2 

## Session 03 과제 
> **1. 벤더 프리픽스??**
- CSS의 기능이 모든 웹 브라우저를 적용시키는게 일반적이지만, 간혹 특정 웹브라우저에서만 지원하는 기능들이 있습니다.
- 이전 시간의 meta 태그 처럼, 꼭 없어도 몰라도 되긴 하지만 종종 사용되고 필요할 때가 있는 만큼 어떻게 동작하는지 확인해 봅니다.

> **2. 벤더 프리픽스가 무엇인지 소개하는 페이지를 만들어 주세요**
- width/ height 를 통해 요소의 너비/높이를 지정할 수 있습니다.
- 자유롭게 벤더 프리픽스를 소개하는 페이지를 만듭니다.
- CSS코드를 활용해주세요!


## Session 04 과제 

> **Block** 
- `inline` : 전후 줄바꿈 없이 한 줄에 다른 엘리먼트들과 나란히 배치 
    - width , height 속성 지정을 무시하고, marging, padding으로 좌우를 반영할 수 있다. 
- `block` : 전후 줄바꿈이 들어가 다른 엘리먼트들을 다른 줄로 밀어내고 혼자 한 줄을 차지. 
    - width, height, margin, padding 속성이 모두 반영된다. 
- `inline` - block : 전후 줄바꿈 없이 한 줄에 나란히 배치되지만 위의 모든 속성이 반영된다. 

 > **Margin**
- `Border` :  경계선
    - 경계선 **바깥 영역**의 공백에 관련된 정의
- `margin` : 
    - `margin-top`, `right`, `bottom`, `left` 를 통해 정의 가능.
    - `margin:auto;` 를 통해 가로 방향으로 중앙에 배치도 가능!

> **Padding**
- `Border` :  경계선
    - 경계선 **안쪽 영역**, Content와 Border 사이 여백을 주기 위해 사용
- `padding` : 
    - padding-top, right, bottom, left 를 통해 정의 가능.
    ``` 
        padding : all
        padding : top/bottom right/left
        padding : top right/left bottom
        padding : top right bottom left
    ```