package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Csc1;
import com.fiberg.iterative.function.Csc2;
import com.fiberg.iterative.function.Fn0;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn2;
import com.fiberg.iterative.function.Fnc0;
import com.fiberg.iterative.function.Fnc1;
import com.fiberg.iterative.function.Fnc3;
import com.fiberg.iterative.function.Fnc4;
import com.fiberg.iterative.function.Fnc5;
import com.fiberg.iterative.function.Fnc6;
import com.fiberg.iterative.function.Fnc7;
import com.fiberg.iterative.function.Fnc8;
import com.fiberg.iterative.function.Prc0;
import com.fiberg.iterative.function.Prc1;
import com.fiberg.iterative.function.Prc2;
import com.fiberg.iterative.function.Rnc;
import com.fiberg.iterative.function.Spc;
import io.vavr.CheckedFunction1;
import io.vavr.CheckedFunction2;
import io.vavr.Function1;
import io.vavr.Function2;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.Value;
import io.vavr.control.Option;
import io.vavr.control.Try;
import java.io.Serializable;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

@FunctionalInterface
public interface Fnc2<T1, T2, R> extends CheckedFunction2<T1, T2, R> {

    public static <T1, T2, R> Fnc2<T1, T2, R> narrow(Fnc2<? super T1, ? super T2, ? extends R> f) {
        return f;
    }

    public static <T1, T2, R> Fnc2<T1, T2, R> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, R> Fnc2<T1, T2, R> value(R r) {
        return (Fnc2 & Serializable)(t1, t2) -> r;
    }

    public static <T1, T2, R> Fnc2<T1, T2, R> of(Fnc2<? super T1, ? super T2, ? extends R> f) {
        return Fnc2.narrow(f);
    }

    public static <T1, T2, R> Fnc2<T1, T2, R> of1(Fnc1<? super T1, ? extends R> f) {
        return Fnc2.narrow(f.ignoring1Rt());
    }

    public static <T1, T2, R> Fnc2<T1, T2, R> of2(Fnc1<? super T2, ? extends R> f) {
        return Fnc2.narrow(f.ignoring1Lt());
    }

    public static <T1, T2, R> Fnc1<Tuple2<T1, T2>, R> tuple(Fnc2<? super T1, ? super T2, ? extends R> f) {
        return Fnc2.of(f).tupled();
    }

    public static <T1, T2, R> Fnc2<T1, T2, R> detuple(Fnc1<? super Tuple2<? extends T1, ? extends T2>, ? extends R> f) {
        return (Fnc2 & Serializable)(t1, t2) -> f.apply((Object)Tuple.of((Object)t1, (Object)t2));
    }

    public static <T1, T2, R> Fnc2<T1, T2, R> check(Fn2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fn2.narrow(f).checked();
    }

    public static <T1, T2, R> Fn2<T1, T2, R> ignore(Fn0<? extends R> f) {
        return Fn0.narrow(f).ignoring2();
    }

    public static <T1, T2, R> Fn2<T1, T2, R> ignoreRt(Fn1<? super T1, ? extends R> f) {
        return Fn1.narrow(f).ignoring1Rt();
    }

    public static <T1, T2, R> Fn2<T1, T2, R> ignoreLt(Fn1<? super T2, ? extends R> f) {
        return Fn1.narrow(f).ignoring1Lt();
    }

    public static <T1, T2, T3, R> Fnc2<T1, T2, R> passRt(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f, T3 t3) {
        return Fnc2.narrow(f.applyRt(t3));
    }

    public static <T1, T2, T3, T4, R> Fnc2<T1, T2, R> passRt(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f, T3 t3, T4 t4) {
        return Fnc2.narrow(f.applyRt(t3, t4));
    }

    public static <T1, T2, T3, T4, T5, R> Fnc2<T1, T2, R> passRt(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T3 t3, T4 t4, T5 t5) {
        return Fnc2.narrow(f.applyRt(t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fnc2<T1, T2, R> passRt(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Fnc2.narrow(f.applyRt(t3, t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc2<T1, T2, R> passRt(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Fnc2.narrow(f.applyRt(t3, t4, t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc2<T1, T2, R> passRt(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Fnc2.narrow(f.applyRt(t3, t4, t5, t6, t7, t8));
    }

    public static <T1, T2, T3, R> Fnc2<T2, T3, R> passLt(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f, T1 t1) {
        return Fnc2.narrow(f.applyLt(t1));
    }

    public static <T1, T2, T3, T4, R> Fnc2<T3, T4, R> passLt(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f, T1 t1, T2 t2) {
        return Fnc2.narrow(f.applyLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, R> Fnc2<T4, T5, R> passLt(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f, T1 t1, T2 t2, T3 t3) {
        return Fnc2.narrow(f.applyLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fnc2<T5, T6, R> passLt(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Fnc2.narrow(f.applyLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc2<T6, T7, R> passLt(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Fnc2.narrow(f.applyLt(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc2<T7, T8, R> passLt(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Fnc2.narrow(f.applyLt(t1, t2, t3, t4, t5, t6));
    }

    public static <T1, T2, R> Fn2<T1, T2, Option<R>> lift(Fnc2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fnc2.liftTry(f).afterApply(Value::toOption);
    }

    public static <T1, T2, R> Fn2<T1, T2, Try<R>> liftTry(Fnc2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fnc2.narrow(f).beforeWrap(Try::of);
    }

    public static <T1, T2, R> Fnc2<T2, T1, R> invert(Fnc2<? super T1, ? super T2, ? extends R> f) {
        return Fnc2.narrow(f).inverted();
    }

    default public Fnc1<T2, R> applyLt(T1 t1) {
        return (Fnc1 & Serializable)t2 -> this.apply(t1, t2);
    }

    default public Fnc1<T1, R> applyRt(T2 t2) {
        return (Fnc1 & Serializable)t1 -> this.apply(t1, t2);
    }

    default public Fnc0<R> toFunction(T1 t1, T2 t2) {
        return (Fnc0 & Serializable)() -> this.apply(t1, t2);
    }

    default public Rnc toRunnable(T1 t1, T2 t2) {
        return this.toFunction(t1, t2).toRunnable();
    }

    default public Csc2<T1, T2> toConsumer() {
        return (arg_0, arg_1) -> ((Fnc2)this).apply(arg_0, arg_1);
    }

    default public Spc<R> toSupplier(T1 t1, T2 t2) {
        return this.toFunction(t1, t2).toSupplier();
    }

    default public Fnc2<T1, T2, R> afterRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return (Fnc2 & Serializable)(t1, t2) -> {
            Object value = this.apply(t1, t2);
            r.run();
            return value;
        };
    }

    default public <V> Fnc2<T1, T2, V> afterApply(Fnc1<? super R, ? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc2 & Serializable)(t1, t2) -> f.apply(this.apply(t1, t2));
    }

    default public <V> Fnc2<T1, T2, V> afterApply(Fnc0<? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc2 & Serializable)(t1, t2) -> f.ignoring1().apply(this.apply(t1, t2));
    }

    default public <V> Fnc2<T1, T2, V> afterGet(Spc<? extends V> s) {
        Objects.requireNonNull(s, "s is null");
        return (Fnc2 & Serializable)(t1, t2) -> s.ignoring1().apply(this.apply(t1, t2));
    }

    default public Fnc2<T1, T2, Boolean> afterTest(Prc1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toFunction();
    }

    default public Prc2<T1, T2> afterTestTo(Prc1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return (Prc2<Object, Object> & Serializable)(t1, t2) -> p.test(this.apply(t1, t2));
    }

    default public Csc2<T1, T2> afterAcceptTo(Csc1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2) -> c.accept(this.apply(t1, t2));
    }

    default public Fnc2<T1, T2, R> afterAccept(Csc1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (Fnc2 & Serializable)(t1, t2) -> {
            Object value = this.apply(t1, t2);
            c.accept(value);
            return value;
        };
    }

    default public <W> Fn2<T1, T2, W> beforeWrap(Fn1<? super Spc<R>, ? extends W> wrap) {
        Objects.requireNonNull(wrap, "wrap is null");
        return (Fn2 & Serializable)(t1, t2) -> wrap.apply(this.toSupplier(t1, t2));
    }

    default public Fnc2<T1, T2, R> beforeRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return (Fnc2 & Serializable)(t1, t2) -> {
            r.run();
            return this.apply(t1, t2);
        };
    }

    default public <B1, B2> Fnc2<B1, B2, R> beforeApply(Fnc2<? super B1, ? super B2, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        return this.beforeApply2(f);
    }

    default public <B1> Fnc1<B1, R> beforeApply1(Fnc1<? super B1, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc1 & Serializable)b1 -> this.tupled().apply((Object)Tuple.narrow((Tuple2)((Tuple2)f.apply(b1))));
    }

    default public <B1, B2> Fnc2<B1, B2, R> beforeApply2(Fnc2<? super B1, ? super B2, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc2 & Serializable)(b1, b2) -> this.tupled().apply((Object)Tuple.narrow((Tuple2)((Tuple2)f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Fnc3<B1, B2, B3, R> beforeApply3(Fnc3<? super B1, ? super B2, ? super B3, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc3 & Serializable)(b1, b2, b3) -> this.tupled().apply((Object)Tuple.narrow((Tuple2)((Tuple2)f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Fnc4<B1, B2, B3, B4, R> beforeApply4(Fnc4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc4 & Serializable)(b1, b2, b3, b4) -> this.tupled().apply((Object)Tuple.narrow((Tuple2)((Tuple2)f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Fnc5<B1, B2, B3, B4, B5, R> beforeApply5(Fnc5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc5 & Serializable)(b1, b2, b3, b4, b5) -> this.tupled().apply((Object)Tuple.narrow((Tuple2)((Tuple2)f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Fnc6<B1, B2, B3, B4, B5, B6, R> beforeApply6(Fnc6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc6 & Serializable)(b1, b2, b3, b4, b5, b6) -> this.tupled().apply((Object)Tuple.narrow((Tuple2)((Tuple2)f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Fnc7<B1, B2, B3, B4, B5, B6, B7, R> beforeApply7(Fnc7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc7 & Serializable)(b1, b2, b3, b4, b5, b6, b7) -> this.tupled().apply((Object)Tuple.narrow((Tuple2)((Tuple2)f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Fnc8<B1, B2, B3, B4, B5, B6, B7, B8, R> beforeApply8(Fnc8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc8 & Serializable)(b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().apply((Object)Tuple.narrow((Tuple2)((Tuple2)f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Fnc2<T1, T2, R> beforeTestOnSuccess(Prc0 p, Fnc2<? super T1, ? super T2, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Fnc2 & Serializable)(t1, t2) -> p.test() != false ? this.apply(t1, t2) : onFailure.apply(t1, t2);
    }

    default public Fnc2<T1, T2, R> beforeTestOnSuccess(Prc0 p, Spc<? extends R> onFailure) {
        return this.beforeTestOnSuccess(p, (R)onFailure.toFunction().ignoring2());
    }

    default public Fnc2<T1, T2, R> beforeTestOnSuccess(Prc0 p, R onFailure) {
        return this.beforeTestOnSuccess(p, (R)Fnc2.value(onFailure));
    }

    default public Fnc2<T1, T2, R> beforeTestOnSuccess(Prc0 p) {
        return this.beforeTestOnSuccess(p, (R)Fnc2.empty());
    }

    default public Fnc2<T1, T2, R> beforeTestOnFailure(Prc0 p, Fnc2<? super T1, ? super T2, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), (R)onSuccess);
    }

    default public Fnc2<T1, T2, R> beforeTestOnFailure(Prc0 p, Spc<? extends R> onSuccess) {
        return this.beforeTestOnFailure(p, (R)onSuccess.toFunction().ignoring2());
    }

    default public Fnc2<T1, T2, R> beforeTestOnFailure(Prc0 p, R onSuccess) {
        return this.beforeTestOnFailure(p, (R)Fnc2.value(onSuccess));
    }

    default public Fnc2<T1, T2, R> beforeTestOnFailure(Prc0 p) {
        return this.beforeTestOnFailure(p, (R)Fnc2.empty());
    }

    default public Spc<R> beforeGet(Spc<? extends Tuple2<? extends T1, ? extends T2>> s) {
        Objects.requireNonNull(s, "s is null");
        return (Spc<Object> & Serializable)() -> this.tupled().apply((Object)Tuple.narrow((Tuple2)((Tuple2)s.get())));
    }

    default public Fn2<T1, T2, Option<R>> lift() {
        return Fnc2.lift(this);
    }

    default public Fn2<T1, T2, Try<R>> liftTry() {
        return Fnc2.liftTry(this);
    }

    default public Fnc2<T2, T1, R> inverted() {
        return (Fnc2 & Serializable)(t2, t1) -> this.apply(t1, t2);
    }

    default public <S> Fnc2<T1, T2, S> afterPassingThroughApply(Fnc2<? super T1, ? super T2, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc2 & Serializable)(t1, t2) -> {
            this.apply(t1, t2);
            return f.apply(t1, t2);
        };
    }

    default public Fnc2<T1, T2, R> afterPassingThroughTest(Prc2<? super T1, ? super T2> p) {
        Objects.requireNonNull(p, "p is null");
        return (Fnc2 & Serializable)(t1, t2) -> {
            Object result = this.apply(t1, t2);
            p.test(t1, t2);
            return result;
        };
    }

    default public Prc2<T1, T2> afterPassingThroughTestTo(Prc2<? super T1, ? super T2> p) {
        Objects.requireNonNull(p, "p is null");
        return (Prc2<Object, Object> & Serializable)(t1, t2) -> {
            this.apply(t1, t2);
            return p.test(t1, t2);
        };
    }

    default public Fnc2<T1, T2, R> afterPassingThroughAccept(Csc2<? super T1, ? super T2> c) {
        Objects.requireNonNull(c, "c is null");
        return (Fnc2 & Serializable)(t1, t2) -> {
            Object result = this.apply(t1, t2);
            c.accept(t1, t2);
            return result;
        };
    }

    default public Csc2<T1, T2> afterPassingThroughAcceptTo(Csc2<? super T1, ? super T2> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2) -> {
            this.apply(t1, t2);
            c.accept(t1, t2);
        };
    }

    default public Fnc2<T1, T2, R> beforePassingThroughApply(Fnc2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc2 & Serializable)(t1, t2) -> {
            f.apply(t1, t2);
            return this.apply(t1, t2);
        };
    }

    default public Fnc2<T1, T2, R> beforePassingThroughTest(Prc2<? super T1, ? super T2> p) {
        Objects.requireNonNull(p, "p is null");
        return (Fnc2 & Serializable)(t1, t2) -> {
            p.test(t1, t2);
            return this.apply(t1, t2);
        };
    }

    default public Fnc2<T1, T2, R> beforePassingThroughAccept(Csc2<? super T1, ? super T2> c) {
        Objects.requireNonNull(c, "c is null");
        return (Fnc2 & Serializable)(t1, t2) -> {
            c.accept(t1, t2);
            return this.apply(t1, t2);
        };
    }

    default public Fnc2<T1, T2, R> beforeSuccessPassingThroughTest(Prc2<? super T1, ? super T2> p, Fnc2<? super T1, ? super T2, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Fnc2 & Serializable)(t1, t2) -> p.test(t1, t2) ? this.apply(t1, t2) : onFailure.apply(t1, t2);
    }

    default public Fnc2<T1, T2, R> beforeSuccessPassingThroughTest(Prc2<? super T1, ? super T2> p, Spc<? extends R> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, (R)onFailure.toFunction().ignoring2());
    }

    default public Fnc2<T1, T2, R> beforeSuccessPassingThroughTest(Prc2<? super T1, ? super T2> p, R onFailure) {
        return this.beforeSuccessPassingThroughTest(p, (R)Fnc2.value(onFailure));
    }

    default public Fnc2<T1, T2, R> beforeSuccessPassingThroughTest(Prc2<? super T1, ? super T2> p) {
        return this.beforeSuccessPassingThroughTest(p, (R)Fnc2.empty());
    }

    default public Fnc2<T1, T2, R> beforeFailurePassingThroughTest(Prc2<? super T1, ? super T2> p, Fnc2<? super T1, ? super T2, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), (R)onSuccess);
    }

    default public Fnc2<T1, T2, R> beforeFailurePassingThroughTest(Prc2<? super T1, ? super T2> p, Spc<? extends R> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, (R)onSuccess.toFunction().ignoring2());
    }

    default public Fnc2<T1, T2, R> beforeFailurePassingThroughTest(Prc2<? super T1, ? super T2> p, R onSuccess) {
        return this.beforeFailurePassingThroughTest(p, (R)Fnc2.value(onSuccess));
    }

    default public Fnc2<T1, T2, R> beforeFailurePassingThroughTest(Prc2<? super T1, ? super T2> p) {
        return this.beforeFailurePassingThroughTest(p, (R)Fnc2.empty());
    }

    default public Fn1<T1, Fnc1<T2, R>> currying() {
        return (Fn1 & Serializable)t1 -> (Fnc1 & Serializable)t2 -> this.apply(t1, t2);
    }

    default public Fn2<T1, T2, R> unchecked() {
        return (arg_0, arg_1) -> ((Function2)super.unchecked()).apply(arg_0, arg_1);
    }

    default public <I1> Fnc3<I1, T1, T2, R> ignoring1Lt() {
        return (Fnc3 & Serializable)(i1, t1, t2) -> this.apply(t1, t2);
    }

    default public <I1> Fnc3<T1, T2, I1, R> ignoring1Rt() {
        return (Fnc3 & Serializable)(t1, t2, i1) -> this.apply(t1, t2);
    }

    default public <I1, I2> Fnc4<I1, I2, T1, T2, R> ignoring2Lt() {
        return (Fnc4 & Serializable)(i1, i2, t1, t2) -> this.apply(t1, t2);
    }

    default public <I1, I2> Fnc4<T1, T2, I1, I2, R> ignoring2Rt() {
        return (Fnc4 & Serializable)(t1, t2, i1, i2) -> this.apply(t1, t2);
    }

    default public <I1, I2, I3> Fnc5<I1, I2, I3, T1, T2, R> ignoring3Lt() {
        return (Fnc5 & Serializable)(i1, i2, i3, t1, t2) -> this.apply(t1, t2);
    }

    default public <I1, I2, I3> Fnc5<T1, T2, I1, I2, I3, R> ignoring3Rt() {
        return (Fnc5 & Serializable)(t1, t2, i1, i2, i3) -> this.apply(t1, t2);
    }

    default public <I1, I2, I3, I4> Fnc6<I1, I2, I3, I4, T1, T2, R> ignoring4Lt() {
        return (Fnc6 & Serializable)(i1, i2, i3, i4, t1, t2) -> this.apply(t1, t2);
    }

    default public <I1, I2, I3, I4> Fnc6<T1, T2, I1, I2, I3, I4, R> ignoring4Rt() {
        return (Fnc6 & Serializable)(t1, t2, i1, i2, i3, i4) -> this.apply(t1, t2);
    }

    default public <I1, I2, I3, I4, I5> Fnc7<I1, I2, I3, I4, I5, T1, T2, R> ignoring5Lt() {
        return (Fnc7 & Serializable)(i1, i2, i3, i4, i5, t1, t2) -> this.apply(t1, t2);
    }

    default public <I1, I2, I3, I4, I5> Fnc7<T1, T2, I1, I2, I3, I4, I5, R> ignoring5Rt() {
        return (Fnc7 & Serializable)(t1, t2, i1, i2, i3, i4, i5) -> this.apply(t1, t2);
    }

    default public <I1, I2, I3, I4, I5, I6> Fnc8<I1, I2, I3, I4, I5, I6, T1, T2, R> ignoring6Lt() {
        return (Fnc8 & Serializable)(i1, i2, i3, i4, i5, i6, t1, t2) -> this.apply(t1, t2);
    }

    default public <I1, I2, I3, I4, I5, I6> Fnc8<T1, T2, I1, I2, I3, I4, I5, I6, R> ignoring6Rt() {
        return (Fnc8 & Serializable)(t1, t2, i1, i2, i3, i4, i5, i6) -> this.apply(t1, t2);
    }

    default public Fnc1<T2, R> apply(T1 t1) {
        return ((CheckedFunction1)super.apply(t1))::apply;
    }

    default public Fnc1<Tuple2<T1, T2>, R> tupled() {
        return ((CheckedFunction1)super.tupled())::apply;
    }

    default public Fn1<T1, CheckedFunction1<T2, R>> curried() {
        return ((Function1)super.curried())::apply;
    }

    default public Fnc2<T2, T1, R> reversed() {
        return (arg_0, arg_1) -> ((CheckedFunction2)super.reversed()).apply(arg_0, arg_1);
    }

    default public Fnc2<T1, T2, R> memoized() {
        return (arg_0, arg_1) -> ((CheckedFunction2)super.memoized()).apply(arg_0, arg_1);
    }

    default public <V> Fnc2<T1, T2, V> andThen(CheckedFunction1<? super R, ? extends V> after) {
        Objects.requireNonNull(after, "after is null");
        return (arg_0, arg_1) -> ((CheckedFunction2)super.andThen(after)).apply(arg_0, arg_1);
    }

    default public Fn2<T1, T2, R> recover(Function<? super Throwable, ? extends BiFunction<? super T1, ? super T2, ? extends R>> recover) {
        Objects.requireNonNull(recover, "recover is null");
        return (arg_0, arg_1) -> ((Function2)super.recover(recover)).apply(arg_0, arg_1);
    }

}
