package com.fiberg.iterative.function;

import io.vavr.CheckedConsumer;
import io.vavr.Tuple;
import io.vavr.Tuple1;

import java.util.Objects;

@FunctionalInterface
public interface Csc1<T1> extends CheckedConsumer<T1> {

    public static <T1> Csc1<T1> narrow(Csc1<? super T1> c) {
        @SuppressWarnings("unchecked")
        final Csc1<T1> csc = (Csc1<T1>) c;
        return csc;
    }

    public static <T1> Csc1<T1> empty() {
        return t1 -> {};
    }

    public static <T1> Csc1<T1> of(Csc1<? super T1> c) {
        return Csc1.narrow(c);
    }

    public static <T1> Csc1<Tuple1<T1>> tuple(Csc1<? super T1> c) {
        return Csc1.<T1>of(c).tupled();
    }

    public static <T1> Csc1<T1> detuple(Csc1<? super Tuple1<? extends T1>> c) {
        return t1 -> c.accept(Tuple.of(t1));
    }

    public static <T1> Csc1<T1> check(Cs1<? super T1> c) {
        Objects.requireNonNull(c, "c is null");
        return Cs1.<T1>narrow(c).checked();
    }

    default public <V> Fnc1<T1, V> andThenApply(Fnc0<? extends V> after) {
        Objects.requireNonNull(after, "after is null");
        return t1 -> {
            this.accept(t1);
            return after.apply();
        };
    }

    public static <T1, T2> Csc1<T1> passRt(Csc2<? super T1, ? super T2> c, T2 t2) {
        return Csc1.narrow(c.acceptRt(t2));
    }

    public static <T1, T2, T3> Csc1<T1> passRt(Csc3<? super T1, ? super T2, ? super T3> c, T2 t2, T3 t3) {
        return Csc1.narrow(c.acceptRt(t2, t3));
    }

    public static <T1, T2, T3, T4> Csc1<T1> passRt(Csc4<? super T1, ? super T2, ? super T3, ? super T4> c, T2 t2, T3 t3, T4 t4) {
        return Csc1.narrow(c.acceptRt(t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5> Csc1<T1> passRt(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Csc1.narrow(c.acceptRt(t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6> Csc1<T1> passRt(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Csc1.narrow(c.acceptRt(t2, t3, t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Csc1<T1> passRt(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Csc1.narrow(c.acceptRt(t2, t3, t4, t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc1<T1> passRt(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Csc1.narrow(c.acceptRt(t2, t3, t4, t5, t6, t7, t8));
    }

    public static <T1, T2> Csc1<T2> passLt(Csc2<? super T1, ? super T2> c, T1 t1) {
        return Csc1.narrow(c.acceptLt(t1));
    }

    public static <T1, T2, T3> Csc1<T3> passLt(Csc3<? super T1, ? super T2, ? super T3> c, T1 t1, T2 t2) {
        return Csc1.narrow(c.acceptLt(t1, t2));
    }

    public static <T1, T2, T3, T4> Csc1<T4> passLt(Csc4<? super T1, ? super T2, ? super T3, ? super T4> c, T1 t1, T2 t2, T3 t3) {
        return Csc1.narrow(c.acceptLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5> Csc1<T5> passLt(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Csc1.narrow(c.acceptLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5, T6> Csc1<T6> passLt(Csc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Csc1.narrow(c.acceptLt(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Csc1<T7> passLt(Csc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Csc1.narrow(c.acceptLt(t1, t2, t3, t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Csc1<T8> passLt(Csc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> c, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Csc1.narrow(c.acceptLt(t1, t2, t3, t4, t5, t6, t7));
    }

    default public <R> Fnc1<T1, R> toFunction(R r) {
        return t1 -> {
            this.accept(t1);
            return r;
        };
    }

    default public Prc1<T1> toPredicate(boolean b) {
        return t1 -> {
            this.accept(t1);
            return b;
        };
    }

    default public Rnc toRunnable(T1 t1) {
        return () -> this.accept(t1);
    }

    default public Csc1<T1> afterRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return t1 -> {
            this.accept(t1);
            r.run();
        };
    }

    default public <R> Csc1<T1> afterApply(Fnc0<? super R> f) {
        Objects.requireNonNull(f, "f is null");
        return this.afterApplyTo(f).toConsumer();
    }

    default public <R> Fnc1<T1, R> afterApplyTo(Fnc0<? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return t1 -> {
            this.accept(t1);
            return f.apply();
        };
    }

    default public Csc1<T1> afterTest(Prc0 p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toConsumer();
    }

    default public Prc1<T1> afterTestTo(Prc0 p) {
        Objects.requireNonNull(p, "p is null");
        return t1 -> {
            this.accept(t1);
            return p.test();
        };
    }

    default public <R> Fnc1<T1, R> afterGet(Spc<? extends R> s) {
        return t1 -> {
            this.accept(t1);
            return s.get();
        };
    }

    default public Csc1<T1> beforeRun(Rnc r) {
        return t1 -> {
            r.run();
            this.accept(t1);
        };
    }

    default public <B1> Csc1<B1> beforeApply(Fnc1<? super B1, ? extends T1> f) {
        return this.beforeApply1(f);
    }

    default public <B1> Csc1<B1> beforeApply1(Fnc1<? super B1, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.accept(f.apply(b1));
    }

    default public <B1, B2> Csc2<B1, B2> beforeApply2(Fnc2<? super B1, ? super B2, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.accept(f.apply(b1, b2));
    }

    default public <B1, B2, B3> Csc3<B1, B2, B3> beforeApply3(Fnc3<? super B1, ? super B2, ? super B3, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.accept(f.apply(b1, b2, b3));
    }

    default public <B1, B2, B3, B4> Csc4<B1, B2, B3, B4> beforeApply4(Fnc4<? super B1, ? super B2, ? super B3, ? super B4, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.accept(f.apply(b1, b2, b3, b4));
    }

    default public <B1, B2, B3, B4, B5> Csc5<B1, B2, B3, B4, B5> beforeApply5(Fnc5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.accept(f.apply(b1, b2, b3, b4, b5));
    }

    default public <B1, B2, B3, B4, B5, B6> Csc6<B1, B2, B3, B4, B5, B6> beforeApply6(Fnc6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.accept(f.apply(b1, b2, b3, b4, b5, b6));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Csc7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fnc7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.accept(f.apply(b1, b2, b3, b4, b5, b6, b7));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Csc8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fnc8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends T1> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.accept(f.apply(b1, b2, b3, b4, b5, b6, b7, b8));
    }

    default public Csc1<T1> beforeTestOnSuccess(Prc0 p, Csc1<? super T1> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> (p.test() ? this : Csc1.<T1>narrow(onFailure)).accept(t1);
    }

    default public Csc1<T1> beforeTestOnSuccess(Prc0 p) {
        return this.beforeTestOnSuccess(p, Csc1.empty());
    }

    default public Csc1<T1> beforeTestOnFailure(Prc0 p, Csc1<? super T1> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Csc1<T1> beforeTestOnFailure(Prc0 p) {
        return this.beforeTestOnFailure(p, Csc1.empty());
    }

    default public Rnc beforeGet(Spc<? extends T1> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.accept(s.get());
    }

    default public <S> Csc1<T1> afterPassingThroughApply(Fnc1<? super T1, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return t1 -> {
            this.accept(t1);
            f.apply(t1);
        };
    }

    default public <S> Fnc1<T1, S> afterPassingThroughApplyTo(Fnc1<? super T1, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return t1 -> {
            this.accept(t1);
            return f.apply(t1);
        };
    }

    default public Csc1<T1> afterPassingThroughTest(Prc1<? super T1> p) {
        Objects.requireNonNull(p, "p is null");
        return t1 -> {
            this.accept(t1);
            p.test(t1);
        };
    }

    default public Prc1<T1> afterPassingThroughTestTo(Prc1<? super T1> p) {
        Objects.requireNonNull(p, "p is null");
        return t1 -> {
            this.accept(t1);
            return p.test(t1);
        };
    }

    default public Csc1<T1> afterPassingThroughAccept(Csc1<? super T1> c) {
        Objects.requireNonNull(c, "c is null");
        return t1 -> {
            this.accept(t1);
            c.accept(t1);
        };
    }

    default public <R> Csc1<T1> beforePassingThroughApply(Fnc1<? super T1, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return t1 -> {
            f.apply(t1);
            this.accept(t1);
        };
    }

    default public Csc1<T1> beforePassingThroughTest(Prc1<? super T1> p) {
        Objects.requireNonNull(p, "p is null");
        return t1 -> {
            p.test(t1);
            this.accept(t1);
        };
    }

    default public Csc1<T1> beforePassingThroughAccept(Csc1<? super T1> c) {
        Objects.requireNonNull(c, "c is null");
        return t1 -> {
            c.accept(t1);
            this.accept(t1);
        };
    }

    default public Csc1<T1> beforeSuccessPassingThroughTest(Prc1<? super T1> p, Csc1<? super T1> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return t1 -> (p.test(t1) ? this : Csc1.<T1>narrow(onFailure)).accept(t1);
    }

    default public Csc1<T1> beforeSuccessPassingThroughTest(Prc1<? super T1> p) {
        return this.beforeSuccessPassingThroughTest(p, Csc1.empty());
    }

    default public Csc1<T1> beforeFailurePassingThroughTest(Prc1<? super T1> p, Csc1<? super T1> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Csc1<T1> beforeFailurePassingThroughTest(Prc1<? super T1> p) {
        return this.beforeFailurePassingThroughTest(p, Csc1.empty());
    }

    default public Csc1<T1> passingThroughNull() {
        return t1 -> {
            if (t1 != null) {
                this.accept(t1);
            }
        };
    }

    default public Csc1<Tuple1<T1>> tupled() {
        return tuple -> this.accept(tuple._1());
    }

    default public Csc1<T1> currying() {
        return this;
    }

    default public Cs1<T1> unchecked() {
        return t1 -> {
            try {
                this.accept(t1);
            }
            catch (Throwable t) {
                SneakyThrow.sneakyThrow(t);
            }
        };
    }

    default public <I1> Csc2<I1, T1> ignoring1Lt() {
        return (i1, t1) -> this.accept(t1);
    }

    default public <I1> Csc2<T1, I1> ignoring1Rt() {
        return (t1, i1) -> this.accept(t1);
    }

    default public <I1, I2> Csc3<I1, I2, T1> ignoring2Lt() {
        return (i1, i2, t1) -> this.accept(t1);
    }

    default public <I1, I2> Csc3<T1, I1, I2> ignoring2Rt() {
        return (t1, i1, i2) -> this.accept(t1);
    }

    default public <I1, I2, I3> Csc4<I1, I2, I3, T1> ignoring3Lt() {
        return (i1, i2, i3, t1) -> this.accept(t1);
    }

    default public <I1, I2, I3> Csc4<T1, I1, I2, I3> ignoring3Rt() {
        return (t1, i1, i2, i3) -> this.accept(t1);
    }

    default public <I1, I2, I3, I4> Csc5<I1, I2, I3, I4, T1> ignoring4Lt() {
        return (i1, i2, i3, i4, t1) -> this.accept(t1);
    }

    default public <I1, I2, I3, I4> Csc5<T1, I1, I2, I3, I4> ignoring4Rt() {
        return (t1, i1, i2, i3, i4) -> this.accept(t1);
    }

    default public <I1, I2, I3, I4, I5> Csc6<I1, I2, I3, I4, I5, T1> ignoring5Lt() {
        return (i1, i2, i3, i4, i5, t1) -> this.accept(t1);
    }

    default public <I1, I2, I3, I4, I5> Csc6<T1, I1, I2, I3, I4, I5> ignoring5Rt() {
        return (t1, i1, i2, i3, i4, i5) -> this.accept(t1);
    }

    default public <I1, I2, I3, I4, I5, I6> Csc7<I1, I2, I3, I4, I5, I6, T1> ignoring6Lt() {
        return (i1, i2, i3, i4, i5, i6, t1) -> this.accept(t1);
    }

    default public <I1, I2, I3, I4, I5, I6> Csc7<T1, I1, I2, I3, I4, I5, I6> ignoring6Rt() {
        return (t1, i1, i2, i3, i4, i5, i6) -> this.accept(t1);
    }

    default public <I1, I2, I3, I4, I5, I6, I7> Csc8<I1, I2, I3, I4, I5, I6, I7, T1> ignoring7Lt() {
        return (i1, i2, i3, i4, i5, i6, i7, t1) -> this.accept(t1);
    }

    default public <I1, I2, I3, I4, I5, I6, I7> Csc8<T1, I1, I2, I3, I4, I5, I6, I7> ignoring7Rt() {
        return (t1, i1, i2, i3, i4, i5, i6, i7) -> this.accept(t1);
    }

    default public Cs1<T1> recover(Fn1<? super Throwable, ? extends Cs1<? super T1>> recover) {
        Objects.requireNonNull(recover, "recover is null");
        return t1 -> {
            try {
                this.accept(t1);
            }
            catch (Throwable throwable) {
                Cs1<? super T1> cons = recover.apply(throwable);
                Objects.requireNonNull(cons, () -> "recover return null for " + throwable.getClass() + ": " + throwable.getMessage());
                cons.accept(t1);
            }
        };
    }

}
