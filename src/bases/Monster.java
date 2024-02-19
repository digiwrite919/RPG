package bases;

import utils.Dice;

public abstract class Monster extends Living {

    // コンストラクタ
    public Monster(String name, String weapon) {
        super(name, weapon);
    }

    // attackメソッドのオーバーライド
    @Override
    public void attack(Living target) {
        // 1から10までのサイコロを振り、自分の攻撃力とかけ合わせが値を相手に与えるダメージとする
        int damage = this.offensive * Dice.get(1, 10);
        // 相手のHPをダメージ値だけ減らす
        target.hp -= damage;
        // コンソールにステータスを表示
        System.out.printf("\n 「%s」が「%s」で攻撃！「%s」に%dのダメージを与えた。\n", this.name, this.weapon, target.name, damage);
    }
}