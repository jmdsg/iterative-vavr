package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import com.fiberg.iterative.function.Csc1;
import com.fiberg.iterative.function.Csc5;
import com.fiberg.iterative.function.Fn1;
import com.fiberg.iterative.function.Fn5;
import com.fiberg.iterative.function.Fnc0;
import com.fiberg.iterative.function.Fnc1;
import com.fiberg.iterative.function.Fnc2;
import com.fiberg.iterative.function.Fnc3;
import com.fiberg.iterative.function.Fnc4;
import com.fiberg.iterative.function.Fnc6;
import com.fiberg.iterative.function.Fnc7;
import com.fiberg.iterative.function.Fnc8;
import com.fiberg.iterative.function.Prc0;
import com.fiberg.iterative.function.Prc1;
import com.fiberg.iterative.function.Prc5;
import com.fiberg.iterative.function.Rnc;
import com.fiberg.iterative.function.Spc;
import io.vavr.CheckedFunction1;
import io.vavr.CheckedFunction2;
import io.vavr.CheckedFunction3;
import io.vavr.CheckedFunction4;
import io.vavr.CheckedFunction5;
import io.vavr.Function1;
import io.vavr.Function5;
import io.vavr.Tuple;
import io.vavr.Tuple5;
import io.vavr.Value;
import io.vavr.control.Option;
import io.vavr.control.Try;
import java.io.Serializable;
import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface Fnc5<T1, T2, T3, T4, T5, R> extends CheckedFunction5<T1, T2, T3, T4, T5, R> {

    public static <T1, T2, T3, T4, T5, R> Fnc5<T1, T2, T3, T4, T5, R> narrow(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return f;
    }

    public static <T1, T2, T3, T4, T5, R> Fnc5<T1, T2, T3, T4, T5, R> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2, T3, T4, T5, R> Fnc5<T1, T2, T3, T4, T5, R> value(R r) {
        return (Fnc5 & Serializable)(t1, t2, t3, t4, t5) -> r;
    }

    public static <T1, T2, T3, T4, T5, R> Fnc5<T1, T2, T3, T4, T5, R> of(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fnc5.narrow(f);
    }

    public static <T1, T2, T3, T4, T5, R> Fnc5<T1, T2, T3, T4, T5, R> of1(Fnc1<? super T1, ? extends R> f) {
        return Fnc5.narrow(f.ignoring4Rt());
    }

    public static <T1, T2, T3, T4, T5, R> Fnc5<T1, T2, T3, T4, T5, R> of2(Fnc1<? super T2, ? extends R> f) {
        return Fnc5.narrow(f.ignoring3Rt().ignoring1Lt());
    }

    public static <T1, T2, T3, T4, T5, R> Fnc5<T1, T2, T3, T4, T5, R> of3(Fnc1<? super T3, ? extends R> f) {
        return Fnc5.narrow(f.ignoring2Rt().ignoring2Lt());
    }

    public static <T1, T2, T3, T4, T5, R> Fnc5<T1, T2, T3, T4, T5, R> of4(Fnc1<? super T4, ? extends R> f) {
        return Fnc5.narrow(f.ignoring1Rt().ignoring3Lt());
    }

    public static <T1, T2, T3, T4, T5, R> Fnc5<T1, T2, T3, T4, T5, R> of5(Fnc1<? super T5, ? extends R> f) {
        return Fnc5.narrow(f.ignoring4Lt());
    }

    public static <T1, T2, T3, T4, T5, R> Fnc1<Tuple5<T1, T2, T3, T4, T5>, R> tuple(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fnc5.of(f).tupled();
    }

    public static <T1, T2, T3, T4, T5, R> Fnc5<T1, T2, T3, T4, T5, R> detuple(Fnc1<? super Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>, ? extends R> f) {
        return (Fnc5 & Serializable)(t1, t2, t3, t4, t5) -> f.apply((Object)Tuple.of((Object)t1, (Object)t2, (Object)t3, (Object)t4, (Object)t5));
    }

    public static <T1, T2, T3, T4, T5, R> Fnc5<T1, T2, T3, T4, T5, R> check(Fn5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fn5.narrow(f).checked();
    }

    public static <T1, T2, T3, T4, T5, R> Fnc5<T1, T2, T3, T4, T5, R> ignore(Fnc0<? extends R> f) {
        return Fnc0.narrow(f).ignoring5();
    }

    public static <T1, T2, T3, T4, T5, R> Fnc5<T1, T2, T3, T4, T5, R> ignore4Rt(Fnc1<? super T1, ? extends R> f) {
        return Fnc1.narrow(f).ignoring4Rt();
    }

    public static <T1, T2, T3, T4, T5, R> Fnc5<T1, T2, T3, T4, T5, R> ignore4Lt(Fnc1<? super T5, ? extends R> f) {
        return Fnc1.narrow(f).ignoring4Lt();
    }

    public static <T1, T2, T3, T4, T5, R> Fnc5<T1, T2, T3, T4, T5, R> ignore3Rt(Fnc2<? super T1, ? super T2, ? extends R> f) {
        return Fnc2.narrow(f).ignoring3Rt();
    }

    public static <T1, T2, T3, T4, T5, R> Fnc5<T1, T2, T3, T4, T5, R> ignore3Lt(Fnc2<? super T4, ? super T5, ? extends R> f) {
        return Fnc2.narrow(f).ignoring3Lt();
    }

    public static <T1, T2, T3, T4, T5, R> Fnc5<T1, T2, T3, T4, T5, R> ignore2Rt(Fnc3<? super T1, ? super T2, ? super T3, ? extends R> f) {
        return Fnc3.narrow(f).ignoring2Rt();
    }

    public static <T1, T2, T3, T4, T5, R> Fnc5<T1, T2, T3, T4, T5, R> ignore2Lt(Fnc3<? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fnc3.narrow(f).ignoring2Lt();
    }

    public static <T1, T2, T3, T4, T5, R> Fnc5<T1, T2, T3, T4, T5, R> ignore1Rt(Fnc4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> f) {
        return Fnc4.narrow(f).ignoring1Rt();
    }

    public static <T1, T2, T3, T4, T5, R> Fnc5<T1, T2, T3, T4, T5, R> ignore1Lt(Fnc4<? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fnc4.narrow(f).ignoring1Lt();
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fnc5<T1, T2, T3, T4, T5, R> passRt(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T6 t6) {
        return Fnc5.narrow(f.applyRt(t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc5<T1, T2, T3, T4, T5, R> passRt(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T6 t6, T7 t7) {
        return Fnc5.narrow(f.applyRt(t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc5<T1, T2, T3, T4, T5, R> passRt(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T6 t6, T7 t7, T8 t8) {
        return Fnc5.narrow(f.applyRt(t6, t7, t8));
    }

    public static <T1, T2, T3, T4, T5, T6, R> Fnc5<T2, T3, T4, T5, T6, R> passLt(Fnc6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> f, T1 t1) {
        return Fnc5.narrow(f.applyLt(t1));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Fnc5<T3, T4, T5, T6, T7, R> passLt(Fnc7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> f, T1 t1, T2 t2) {
        return Fnc5.narrow(f.applyLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Fnc5<T4, T5, T6, T7, T8, R> passLt(Fnc8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> f, T1 t1, T2 t2, T3 t3) {
        return Fnc5.narrow(f.applyLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, Option<R>> lift(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fnc5.liftTry(f).afterApply(Value::toOption);
    }

    public static <T1, T2, T3, T4, T5, R> Fn5<T1, T2, T3, T4, T5, Try<R>> liftTry(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return Fnc5.narrow(f).beforeWrap(Try::of);
    }

    public static <T1, T2, T3, T4, T5, R> Fnc5<T5, T4, T3, T2, T1, R> invert(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        return Fnc5.narrow(f).inverted();
    }

    default public Fnc4<T2, T3, T4, T5, R> applyLt(T1 t1) {
        return (Fnc4 & Serializable)(t2, t3, t4, t5) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public Fnc3<T3, T4, T5, R> applyLt(T1 t1, T2 t2) {
        return (Fnc3 & Serializable)(t3, t4, t5) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public Fnc2<T4, T5, R> applyLt(T1 t1, T2 t2, T3 t3) {
        return (Fnc2 & Serializable)(t4, t5) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public Fnc1<T5, R> applyLt(T1 t1, T2 t2, T3 t3, T4 t4) {
        return (Fnc1 & Serializable)t5 -> this.apply(t1, t2, t3, t4, t5);
    }

    default public Fnc4<T1, T2, T3, T4, R> applyRt(T5 t5) {
        return (Fnc4 & Serializable)(t1, t2, t3, t4) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public Fnc3<T1, T2, T3, R> applyRt(T4 t4, T5 t5) {
        return (Fnc3 & Serializable)(t1, t2, t3) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public Fnc2<T1, T2, R> applyRt(T3 t3, T4 t4, T5 t5) {
        return (Fnc2 & Serializable)(t1, t2) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public Fnc1<T1, R> applyRt(T2 t2, T3 t3, T4 t4, T5 t5) {
        return (Fnc1 & Serializable)t1 -> this.apply(t1, t2, t3, t4, t5);
    }

    default public Fnc0<R> toFunction(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return (Fnc0 & Serializable)() -> this.apply(t1, t2, t3, t4, t5);
    }

    default public Rnc toRunnable(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return this.toFunction(t1, t2, t3, t4, t5).toRunnable();
    }

    default public Csc5<T1, T2, T3, T4, T5> toConsumer() {
        return (arg_0, arg_1, arg_2, arg_3, arg_4) -> ((Fnc5)this).apply(arg_0, arg_1, arg_2, arg_3, arg_4);
    }

    default public Spc<R> toSupplier(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return this.toFunction(t1, t2, t3, t4, t5).toSupplier();
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> afterRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return (Fnc5 & Serializable)(t1, t2, t3, t4, t5) -> {
            Object value = this.apply(t1, t2, t3, t4, t5);
            r.run();
            return value;
        };
    }

    default public <V> Fnc5<T1, T2, T3, T4, T5, V> afterApply(Fnc1<? super R, ? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc5 & Serializable)(t1, t2, t3, t4, t5) -> f.apply(this.apply(t1, t2, t3, t4, t5));
    }

    default public <V> Fnc5<T1, T2, T3, T4, T5, V> afterApply(Fnc0<? extends V> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc5 & Serializable)(t1, t2, t3, t4, t5) -> f.ignoring1().apply(this.apply(t1, t2, t3, t4, t5));
    }

    default public <V> Fnc5<T1, T2, T3, T4, T5, V> afterGet(Spc<? extends V> s) {
        Objects.requireNonNull(s, "s is null");
        return (Fnc5 & Serializable)(t1, t2, t3, t4, t5) -> s.ignoring1().apply(this.apply(t1, t2, t3, t4, t5));
    }

    default public Fnc5<T1, T2, T3, T4, T5, Boolean> afterTest(Prc1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return this.afterTestTo(p).toFunction();
    }

    default public Prc5<T1, T2, T3, T4, T5> afterTestTo(Prc1<? super R> p) {
        Objects.requireNonNull(p, "p is null");
        return (Prc5<Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5) -> p.test(this.apply(t1, t2, t3, t4, t5));
    }

    default public Csc5<T1, T2, T3, T4, T5> afterAcceptTo(Csc1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5) -> c.accept(this.apply(t1, t2, t3, t4, t5));
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> afterAccept(Csc1<? super R> c) {
        Objects.requireNonNull(c, "c is null");
        return (Fnc5 & Serializable)(t1, t2, t3, t4, t5) -> {
            Object value = this.apply(t1, t2, t3, t4, t5);
            c.accept(value);
            return value;
        };
    }

    default public <W> Fn5<T1, T2, T3, T4, T5, W> beforeWrap(Fn1<? super Spc<R>, ? extends W> wrap) {
        Objects.requireNonNull(wrap, "wrap is null");
        return (Fn5 & Serializable)(t1, t2, t3, t4, t5) -> wrap.apply(this.toSupplier(t1, t2, t3, t4, t5));
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> beforeRun(Rnc r) {
        Objects.requireNonNull(r, "r is null");
        return (Fnc5 & Serializable)(t1, t2, t3, t4, t5) -> {
            r.run();
            return this.apply(t1, t2, t3, t4, t5);
        };
    }

    default public <B1, B2, B3, B4, B5> Fnc5<B1, B2, B3, B4, B5, R> beforeApply(Fnc5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        return this.beforeApply5(f);
    }

    default public <B1> Fnc1<B1, R> beforeApply1(Fnc1<? super B1, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc1 & Serializable)b1 -> this.tupled().apply((Object)Tuple.narrow((Tuple5)((Tuple5)f.apply(b1))));
    }

    default public <B1, B2> Fnc2<B1, B2, R> beforeApply2(Fnc2<? super B1, ? super B2, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc2 & Serializable)(b1, b2) -> this.tupled().apply((Object)Tuple.narrow((Tuple5)((Tuple5)f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Fnc3<B1, B2, B3, R> beforeApply3(Fnc3<? super B1, ? super B2, ? super B3, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc3 & Serializable)(b1, b2, b3) -> this.tupled().apply((Object)Tuple.narrow((Tuple5)((Tuple5)f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Fnc4<B1, B2, B3, B4, R> beforeApply4(Fnc4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc4 & Serializable)(b1, b2, b3, b4) -> this.tupled().apply((Object)Tuple.narrow((Tuple5)((Tuple5)f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Fnc5<B1, B2, B3, B4, B5, R> beforeApply5(Fnc5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc5 & Serializable)(b1, b2, b3, b4, b5) -> this.tupled().apply((Object)Tuple.narrow((Tuple5)((Tuple5)f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Fnc6<B1, B2, B3, B4, B5, B6, R> beforeApply6(Fnc6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc6 & Serializable)(b1, b2, b3, b4, b5, b6) -> this.tupled().apply((Object)Tuple.narrow((Tuple5)((Tuple5)f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Fnc7<B1, B2, B3, B4, B5, B6, B7, R> beforeApply7(Fnc7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc7 & Serializable)(b1, b2, b3, b4, b5, b6, b7) -> this.tupled().apply((Object)Tuple.narrow((Tuple5)((Tuple5)f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Fnc8<B1, B2, B3, B4, B5, B6, B7, B8, R> beforeApply8(Fnc8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc8 & Serializable)(b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().apply((Object)Tuple.narrow((Tuple5)((Tuple5)f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> beforeTestOnSuccess(Prc0 p, Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Fnc5 & Serializable)(t1, t2, t3, t4, t5) -> p.test() != false ? this.apply(t1, t2, t3, t4, t5) : onFailure.apply(t1, t2, t3, t4, t5);
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> beforeTestOnSuccess(Prc0 p, Spc<? extends R> onFailure) {
        return this.beforeTestOnSuccess(p, (R)onFailure.toFunction().ignoring5());
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> beforeTestOnSuccess(Prc0 p, R onFailure) {
        return this.beforeTestOnSuccess(p, (R)Fnc5.value(onFailure));
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> beforeTestOnSuccess(Prc0 p) {
        return this.beforeTestOnSuccess(p, (R)Fnc5.empty());
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> beforeTestOnFailure(Prc0 p, Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), (R)onSuccess);
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> beforeTestOnFailure(Prc0 p, Spc<? extends R> onSuccess) {
        return this.beforeTestOnFailure(p, (R)onSuccess.toFunction().ignoring5());
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> beforeTestOnFailure(Prc0 p, R onSuccess) {
        return this.beforeTestOnFailure(p, (R)Fnc5.value(onSuccess));
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> beforeTestOnFailure(Prc0 p) {
        return this.beforeTestOnFailure(p, (R)Fnc5.empty());
    }

    default public Spc<R> beforeGet(Spc<? extends Tuple5<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5>> s) {
        Objects.requireNonNull(s, "s is null");
        return (Spc<Object> & Serializable)() -> this.tupled().apply((Object)Tuple.narrow((Tuple5)((Tuple5)s.get())));
    }

    default public Fn5<T1, T2, T3, T4, T5, Option<R>> lift() {
        return Fnc5.lift(this);
    }

    default public Fn5<T1, T2, T3, T4, T5, Try<R>> liftTry() {
        return Fnc5.liftTry(this);
    }

    default public Fnc5<T5, T4, T3, T2, T1, R> inverted() {
        return (Fnc5 & Serializable)(t5, t4, t3, t2, t1) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public <S> Fnc5<T1, T2, T3, T4, T5, S> afterPassingThroughApply(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends S> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc5 & Serializable)(t1, t2, t3, t4, t5) -> {
            this.apply(t1, t2, t3, t4, t5);
            return f.apply(t1, t2, t3, t4, t5);
        };
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> afterPassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        Objects.requireNonNull(p, "p is null");
        return (Fnc5 & Serializable)(t1, t2, t3, t4, t5) -> {
            Object result = this.apply(t1, t2, t3, t4, t5);
            p.test(t1, t2, t3, t4, t5);
            return result;
        };
    }

    default public Prc5<T1, T2, T3, T4, T5> afterPassingThroughTestTo(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        Objects.requireNonNull(p, "p is null");
        return (Prc5<Object, Object, Object, Object, Object> & Serializable)(t1, t2, t3, t4, t5) -> {
            this.apply(t1, t2, t3, t4, t5);
            return p.test(t1, t2, t3, t4, t5);
        };
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> afterPassingThroughAccept(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        Objects.requireNonNull(c, "c is null");
        return (Fnc5 & Serializable)(t1, t2, t3, t4, t5) -> {
            Object result = this.apply(t1, t2, t3, t4, t5);
            c.accept(t1, t2, t3, t4, t5);
            return result;
        };
    }

    default public Csc5<T1, T2, T3, T4, T5> afterPassingThroughAcceptTo(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2, t3, t4, t5) -> {
            this.apply(t1, t2, t3, t4, t5);
            c.accept(t1, t2, t3, t4, t5);
        };
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> beforePassingThroughApply(Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (Fnc5 & Serializable)(t1, t2, t3, t4, t5) -> {
            f.apply(t1, t2, t3, t4, t5);
            return this.apply(t1, t2, t3, t4, t5);
        };
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> beforePassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        Objects.requireNonNull(p, "p is null");
        return (Fnc5 & Serializable)(t1, t2, t3, t4, t5) -> {
            p.test(t1, t2, t3, t4, t5);
            return this.apply(t1, t2, t3, t4, t5);
        };
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> beforePassingThroughAccept(Csc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> c) {
        Objects.requireNonNull(c, "c is null");
        return (Fnc5 & Serializable)(t1, t2, t3, t4, t5) -> {
            c.accept(t1, t2, t3, t4, t5);
            return this.apply(t1, t2, t3, t4, t5);
        };
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> beforeSuccessPassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (Fnc5 & Serializable)(t1, t2, t3, t4, t5) -> p.test(t1, t2, t3, t4, t5) ? this.apply(t1, t2, t3, t4, t5) : onFailure.apply(t1, t2, t3, t4, t5);
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> beforeSuccessPassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Spc<? extends R> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, (R)onFailure.toFunction().ignoring5());
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> beforeSuccessPassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, R onFailure) {
        return this.beforeSuccessPassingThroughTest(p, (R)Fnc5.value(onFailure));
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> beforeSuccessPassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return this.beforeSuccessPassingThroughTest(p, (R)Fnc5.empty());
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> beforeFailurePassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Fnc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), (R)onSuccess);
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> beforeFailurePassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, Spc<? extends R> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, (R)onSuccess.toFunction().ignoring5());
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> beforeFailurePassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, R onSuccess) {
        return this.beforeFailurePassingThroughTest(p, (R)Fnc5.value(onSuccess));
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> beforeFailurePassingThroughTest(Prc5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p) {
        return this.beforeFailurePassingThroughTest(p, (R)Fnc5.empty());
    }

    default public Fnc1<T1, Fnc1<T2, Fnc1<T3, Fnc1<T4, Fnc1<T5, R>>>>> currying() {
        return (Fnc1 & Serializable)t1 -> (Fnc1 & Serializable)t2 -> (Fnc1 & Serializable)t3 -> (Fnc1 & Serializable)t4 -> (Fnc1 & Serializable)t5 -> this.apply(t1, t2, t3, t4, t5);
    }

    default public Fn5<T1, T2, T3, T4, T5, R> unchecked() {
        return (arg_0, arg_1, arg_2, arg_3, arg_4) -> ((Function5)super.unchecked()).apply(arg_0, arg_1, arg_2, arg_3, arg_4);
    }

    default public <I1> Fnc6<I1, T1, T2, T3, T4, T5, R> ignoring1Lt() {
        return (Fnc6 & Serializable)(i1, t1, t2, t3, t4, t5) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public <I1> Fnc6<T1, T2, T3, T4, T5, I1, R> ignoring1Rt() {
        return (Fnc6 & Serializable)(t1, t2, t3, t4, t5, i1) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public <I1, I2> Fnc7<I1, I2, T1, T2, T3, T4, T5, R> ignoring2Lt() {
        return (Fnc7 & Serializable)(i1, i2, t1, t2, t3, t4, t5) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public <I1, I2> Fnc7<T1, T2, T3, T4, T5, I1, I2, R> ignoring2Rt() {
        return (Fnc7 & Serializable)(t1, t2, t3, t4, t5, i1, i2) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public <I1, I2, I3> Fnc8<I1, I2, I3, T1, T2, T3, T4, T5, R> ignoring3Lt() {
        return (Fnc8 & Serializable)(i1, i2, i3, t1, t2, t3, t4, t5) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public <I1, I2, I3> Fnc8<T1, T2, T3, T4, T5, I1, I2, I3, R> ignoring3Rt() {
        return (Fnc8 & Serializable)(t1, t2, t3, t4, t5, i1, i2, i3) -> this.apply(t1, t2, t3, t4, t5);
    }

    default public Fnc1<Tuple5<T1, T2, T3, T4, T5>, R> tupled() {
        return ((CheckedFunction1)super.tupled())::apply;
    }

    default public Fnc4<T2, T3, T4, T5, R> apply(T1 t1) {
        return (arg_0, arg_1, arg_2, arg_3) -> ((CheckedFunction4)super.apply(t1)).apply(arg_0, arg_1, arg_2, arg_3);
    }

    default public Fnc3<T3, T4, T5, R> apply(T1 t1, T2 t2) {
        return (arg_0, arg_1, arg_2) -> ((CheckedFunction3)super.apply(t1, t2)).apply(arg_0, arg_1, arg_2);
    }

    default public Fnc2<T4, T5, R> apply(T1 t1, T2 t2, T3 t3) {
        return (arg_0, arg_1) -> ((CheckedFunction2)super.apply(t1, t2, t3)).apply(arg_0, arg_1);
    }

    default public Fnc1<T5, R> apply(T1 t1, T2 t2, T3 t3, T4 t4) {
        return ((CheckedFunction1)super.apply(t1, t2, t3, t4))::apply;
    }

    default public Fn1<T1, Function1<T2, Function1<T3, Function1<T4, CheckedFunction1<T5, R>>>>> curried() {
        return ((Function1)super.curried())::apply;
    }

    default public Fnc5<T5, T4, T3, T2, T1, R> reversed() {
        return (arg_0, arg_1, arg_2, arg_3, arg_4) -> ((CheckedFunction5)super.reversed()).apply(arg_0, arg_1, arg_2, arg_3, arg_4);
    }

    default public Fnc5<T1, T2, T3, T4, T5, R> memoized() {
        return (arg_0, arg_1, arg_2, arg_3, arg_4) -> ((CheckedFunction5)super.memoized()).apply(arg_0, arg_1, arg_2, arg_3, arg_4);
    }

    default public <V> Fnc5<T1, T2, T3, T4, T5, V> andThen(CheckedFunction1<? super R, ? extends V> after) {
        return (arg_0, arg_1, arg_2, arg_3, arg_4) -> ((CheckedFunction5)super.andThen(after)).apply(arg_0, arg_1, arg_2, arg_3, arg_4);
    }

    default public Fn5<T1, T2, T3, T4, T5, R> recover(Function<? super Throwable, ? extends Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R>> recover) {
        Objects.requireNonNull(recover, "recover is null");
        return (arg_0, arg_1, arg_2, arg_3, arg_4) -> ((Function5)super.recover(recover)).apply(arg_0, arg_1, arg_2, arg_3, arg_4);
    }

}