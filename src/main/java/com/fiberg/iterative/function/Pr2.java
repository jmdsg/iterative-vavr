package com.fiberg.iterative.function;

import com.fiberg.iterative.core.IterativeInternals;
import io.vavr.Function2;
import io.vavr.Tuple;
import io.vavr.Tuple2;

import java.util.Objects;

@FunctionalInterface
public interface Pr2<T1, T2> extends Function2<T1, T2, Boolean> {

    default public Boolean apply(T1 t1, T2 t2) {
        return this.test(t1, t2);
    }

    public static <T1, T2> Pr2<T1, T2> narrow(Pr2<? super T1, ? super T2> p) {
        @SuppressWarnings("unchecked")
        final Pr2<T1, T2> pr = (Pr2<T1, T2>) p;
        return pr;
    }

    public static <T1, T2> Pr2<T1, T2> empty() {
        return IterativeInternals::none;
    }

    public static <T1, T2> Pr2<T1, T2> value(Boolean b) {
        return (t1, t2) -> b;
    }

    public static <T1, T2> Pr2<T1, T2> of(Pr2<? super T1, ? super T2> p) {
        return Pr2.narrow(p);
    }

    public static <T1, T2> Pr2<T1, T2> of1(Pr1<? super T1> f) {
        return Pr2.<T1, T2>narrow(f.ignoring1Rt());
    }

    public static <T1, T2> Pr2<T1, T2> of2(Pr1<? super T2> f) {
        return Pr2.<T1, T2>narrow(f.ignoring1Lt());
    }

    public static <T1, T2> Pr2<T1, T2> fromFunction(Fn2<? super T1, ? super T2, Boolean> f) {
        return f::apply;
    }

    public static <T1, T2> Pr2<T1, T2> fromSupplier(Sp<? extends Boolean> s) {
        return Pr2.fromFunction(Sp.<Boolean>narrow(s).toFunction().ignoring2());
    }

    public static <T1, T2> Pr2<T1, T2> negate(Pr2<? super T1, ? super T2> p) {
        return Pr2.<T1, T2>narrow(p.negated());
    }

    @SafeVarargs
    public static <T1, T2> Pr2<T1, T2> and(Pr2<? super T1, ? super T2> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.and(ps);
    }

    public static <T1, T2> Pr2<T1, T2> and(Pr2<? super T1, ? super T2> p, Pr0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Pr2.narrow(p) : Pr2.<T1, T2>narrow(p).and(Predicates.and(ps));
    }

    @SafeVarargs
    public static <T1, T2> Pr2<T1, T2> or(Pr2<? super T1, ? super T2> ... ps) {
        Objects.requireNonNull(ps, "ps is null");
        return Predicates.or(ps);
    }

    public static <T1, T2> Pr2<T1, T2> or(Pr2<? super T1, ? super T2> p, Pr0 ... ps) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(ps, "ps is null");
        return ps.length == 0 ? Pr2.narrow(p) : Pr2.<T1, T2>narrow(p).or(Predicates.or(ps));
    }

    public static <T1, T2> Pr1<Tuple2<T1, T2>> tuple(Pr2<? super T1, ? super T2> p) {
        return Pr2.<T1, T2>of(p).tupled();
    }

    public static <T1, T2> Pr2<T1, T2> detuple(Pr1<? super Tuple2<? extends T1, ? extends T2>> p) {
        return (t1, t2) -> p.test(Tuple.of(t1, t2));
    }

    public static <T1, T2> Pr2<T1, T2> uncheck(Prc2<? super T1, ? super T2> p) {
        Objects.requireNonNull(p, "p is null");
        return Prc2.<T1, T2>narrow(p).unchecked();
    }

    public static <T1, T2> Pr2<T1, T2> ignore(Pr0 p) {
        return p.ignoring2();
    }

    public static <T1, T2> Pr2<T1, T2> ignoreRt(Pr1<? super T1> p) {
        return Pr1.<T1>narrow(p).ignoring1Rt();
    }

    public static <T1, T2> Pr2<T1, T2> ignoreLt(Pr1<? super T2> p) {
        return Pr1.<T2>narrow(p).ignoring1Lt();
    }

    public static <T1, T2, T3> Pr2<T1, T2> passRt(Pr3<? super T1, ? super T2, ? super T3> p, T3 t3) {
        return Pr2.narrow(p.testRt(t3));
    }

    public static <T1, T2, T3, T4> Pr2<T1, T2> passRt(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, T3 t3, T4 t4) {
        return Pr2.narrow(p.testRt(t3, t4));
    }

    public static <T1, T2, T3, T4, T5> Pr2<T1, T2> passRt(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, T3 t3, T4 t4, T5 t5) {
        return Pr2.narrow(p.testRt(t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6> Pr2<T1, T2> passRt(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Pr2.narrow(p.testRt(t3, t4, t5, t6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr2<T1, T2> passRt(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return Pr2.narrow(p.testRt(t3, t4, t5, t6, t7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr2<T1, T2> passRt(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return Pr2.narrow(p.testRt(t3, t4, t5, t6, t7, t8));
    }

    public static <T1, T2, T3> Pr2<T2, T3> passLt(Pr3<? super T1, ? super T2, ? super T3> p, T1 t1) {
        return Pr2.narrow(p.testLt(t1));
    }

    public static <T1, T2, T3, T4> Pr2<T3, T4> passLt(Pr4<? super T1, ? super T2, ? super T3, ? super T4> p, T1 t1, T2 t2) {
        return Pr2.narrow(p.testLt(t1, t2));
    }

    public static <T1, T2, T3, T4, T5> Pr2<T4, T5> passLt(Pr5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> p, T1 t1, T2 t2, T3 t3) {
        return Pr2.narrow(p.testLt(t1, t2, t3));
    }

    public static <T1, T2, T3, T4, T5, T6> Pr2<T5, T6> passLt(Pr6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> p, T1 t1, T2 t2, T3 t3, T4 t4) {
        return Pr2.narrow(p.testLt(t1, t2, t3, t4));
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Pr2<T6, T7> passLt(Pr7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return Pr2.narrow(p.testLt(t1, t2, t3, t4, t5));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Pr2<T7, T8> passLt(Pr8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> p, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return Pr2.narrow(p.testLt(t1, t2, t3, t4, t5, t6));
    }

    public static <T1, T2> boolean passAndTest(Pr2<? super T1, ? super T2> p, T1 t1, T2 t2) {
        return Pr0.pass(p, t1, t2).test();
    }

    public static <T1, T2> Pr2<T2, T1> invert(Pr2<? super T1, ? super T2> p) {
        return Pr2.<T1, T2>narrow(p).inverted();
    }

    public boolean test(T1 t1, T2 t2);

    default public Pr1<T2> testLt(T1 t1) {
        return t2 -> this.test(t1, t2);
    }

    default public Pr1<T1> testRt(T2 t2) {
        return t1 -> this.test(t1, t2);
    }

    default public Fn2<T1, T2, Boolean> toFunction() {
        return this::test;
    }

    default public Cs2<T1, T2> toConsumer() {
        return this::test;
    }

    default public Pr0 toPredicate(T1 t1, T2 t2) {
        return () -> this.test(t1, t2);
    }

    default public Sp<Boolean> toSupplier(T1 t1, T2 t2) {
        return this.toPredicate(t1, t2).toSupplier();
    }

    default public Rn toRunnable(T1 t1, T2 t2) {
        return this.toPredicate(t1, t2).toRunnable();
    }

    default public <R> R passEvaluated(Sp<? extends R> onSuccess, Sp<? extends R> onFailure, T1 t1, T2 t2) {
        return this.toPredicate(t1, t2).evaluated(onSuccess, onFailure);
    }

    default public <R> R passEvaluated(Sp<? extends R> onSuccess, R onFailure, T1 t1, T2 t2) {
        return this.toPredicate(t1, t2).evaluated(onSuccess, onFailure);
    }

    default public <R> R passEvaluated(R onSuccess, Sp<? extends R> onFailure, T1 t1, T2 t2) {
        return this.toPredicate(t1, t2).evaluated(onSuccess, onFailure);
    }

    default public <R> R passEvaluated(R onSuccess, R onFailure, T1 t1, T2 t2) {
        return this.toPredicate(t1, t2).evaluated(onSuccess, onFailure);
    }

    default public <R> R passEvaluatedOnSuccess(Sp<? extends R> onSuccess, T1 t1, T2 t2) {
        return this.toPredicate(t1, t2).evaluatedOnSuccess(onSuccess);
    }

    default public <R> R passEvaluatedOnFailure(Sp<? extends R> onFailure, T1 t1, T2 t2) {
        return this.toPredicate(t1, t2).evaluatedOnFailure(onFailure);
    }

    default public <R> R passEvaluatedOnSuccess(R onSuccess, T1 t1, T2 t2) {
        return this.toPredicate(t1, t2).evaluatedOnSuccess(onSuccess);
    }

    default public <R> R passEvaluatedOnFailure(R onFailure, T1 t1, T2 t2) {
        return this.toPredicate(t1, t2).evaluatedOnFailure(onFailure);
    }

    default public Pr2<T1, T2> afterRunOn(Rn onSuccess, Rn onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2) -> {
            boolean result = this.test(t1, t2);
            (result ? onSuccess : onFailure).run();
            return result;
        };
    }

    default public Pr2<T1, T2> afterTestOn(Pr1<Boolean> onSuccess, Pr1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(), onFailure.toFunction());
    }

    default public Pr2<T1, T2> afterTestOn(Pr0 onSuccess, Pr0 onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterTestOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Pr2<T1, T2> afterApplyOn(Fn1<Boolean, Boolean> onSuccess, Fn1<Boolean, Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return Pr2.fromFunction(this.afterApplyOnTo(onSuccess, onFailure));
    }

    default public <R> Fn2<T1, T2, R> afterApplyOnTo(Fn1<Boolean, ? extends R> onSuccess, Fn1<Boolean, ? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2) -> {
            boolean result = this.test(t1, t2);
            return (result ? onSuccess : onFailure).apply(result);
        };
    }

    default public Pr2<T1, T2> afterApplyOn(Fn0<Boolean> onSuccess, Fn0<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onFailure.ignoring1(), onFailure.ignoring1());
    }

    default public <R> Fn2<T1, T2, R> afterApplyOnTo(Fn0<? extends R> onSuccess, Fn0<? extends R> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Pr2<T1, T2> afterGetOn(Sp<Boolean> onSuccess, Sp<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.ignoring1(), onFailure.ignoring1());
    }

    default public Cs2<T1, T2> afterAcceptOnTo(Cs1<Boolean> onSuccess, Cs1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOnTo(onSuccess.toFunction(null), onFailure.toFunction(null)).toConsumer();
    }

    default public Pr2<T1, T2> afterAcceptOn(Cs1<Boolean> onSuccess, Cs1<Boolean> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return this.afterApplyOn(onSuccess.toFunction(null), onFailure.toFunction(null));
    }

    default public Pr2<T1, T2> afterRun(Rn r) {
        return this.afterRunOn(r, r);
    }

    default public Pr2<T1, T2> afterTest(Pr1<Boolean> p) {
        return this.afterTestOn(p, p);
    }

    default public Pr2<T1, T2> afterTest(Pr0 p) {
        return this.afterTestOn(p, p);
    }

    default public Pr2<T1, T2> afterApply(Fn1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fn2<T1, T2, R> afterApplyTo(Fn1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Pr2<T1, T2> afterApply(Fn0<Boolean> f) {
        return this.afterApplyOn(f, f);
    }

    default public <R> Fn2<T1, T2, R> afterApplyTo(Fn0<? extends R> f) {
        return this.afterApplyOnTo(f, f);
    }

    default public Pr2<T1, T2> afterGet(Sp<Boolean> s) {
        return this.afterGetOn(s, s);
    }

    default public Cs2<T1, T2> afterAcceptTo(Cs1<Boolean> c) {
        return this.afterAcceptOnTo(c, c);
    }

    default public Pr2<T1, T2> afterAccept(Cs1<Boolean> c) {
        return this.afterAcceptOn(c, c);
    }

    default public Pr2<T1, T2> beforeWrap(Pr1<? super Spc<Boolean>> wrap) {
        return Pr2.fromFunction(this.beforeWrapTo(wrap.toFunction()));
    }

    default public <W> Fn2<T1, T2, W> beforeWrapTo(Fn1<? super Spc<Boolean>, ? extends W> wrap) {
        return (t1, t2) -> wrap.apply(this.toSupplier(t1, t2).checked());
    }

    default public Pr2<T1, T2> afterRunOnSuccess(Rn r) {
        return this.afterRunOn(r, Rn.empty());
    }

    default public Pr2<T1, T2> afterTestOnSuccess(Pr1<Boolean> p) {
        return this.afterTestOn(p, Pr1.empty());
    }

    default public Pr2<T1, T2> afterTestOnSuccess(Pr0 p) {
        return this.afterTestOn(p, Pr0.empty());
    }

    default public Pr2<T1, T2> afterApplyOnSuccess(Fn1<Boolean, Boolean> f) {
        return this.afterApplyOn(f, Fn1.empty());
    }

    default public <R> Fn2<T1, T2, R> afterApplyOnSuccessTo(Fn1<Boolean, ? extends R> f) {
        return this.afterApplyOnTo(f, Fn1.empty());
    }

    default public Pr2<T1, T2> afterApplyOnSuccess(Fn0<Boolean> f) {
        return this.afterApplyOn(f, Fn0.empty());
    }

    default public <R> Fn2<T1, T2, R> afterApplyOnSuccessTo(Fn0<? extends R> f) {
        return this.afterApplyOnTo(f, Fn0.empty());
    }

    default public Pr2<T1, T2> afterGetOnSuccess(Sp<Boolean> s) {
        return this.afterGetOn(s, Sp.empty());
    }

    default public Cs2<T1, T2> afterAcceptOnSuccessTo(Cs1<Boolean> c) {
        return this.afterAcceptOnTo(c, Cs1.empty());
    }

    default public Pr2<T1, T2> afterAcceptOnSuccess(Cs1<Boolean> c) {
        return this.afterAcceptOn(c, Cs1.empty());
    }

    default public Pr2<T1, T2> afterRunOnFailure(Rn r) {
        return this.negated().afterRunOnSuccess(r);
    }

    default public Pr2<T1, T2> afterTestOnFailure(Pr1<Boolean> p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Pr2<T1, T2> afterTestOnFailure(Pr0 p) {
        return this.negated().afterTestOnSuccess(p);
    }

    default public Pr2<T1, T2> afterApplyOnFailure(Fn1<Boolean, Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fn2<T1, T2, R> afterApplyOnFailureTo(Fn1<Boolean, ? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Pr2<T1, T2> afterApplyOnFailure(Fn0<Boolean> f) {
        return this.negated().afterApplyOnSuccess(f);
    }

    default public <R> Fn2<T1, T2, R> afterApplyOnFailureTo(Fn0<? extends R> f) {
        return this.negated().afterApplyOnSuccessTo(f);
    }

    default public Pr2<T1, T2> afterGetOnFailure(Sp<Boolean> s) {
        return this.negated().afterGetOnSuccess(s);
    }

    default public Cs2<T1, T2> afterAcceptOnFailureTo(Cs1<Boolean> c) {
        return this.negated().afterAcceptOnSuccessTo(c);
    }

    default public Pr2<T1, T2> afterAcceptOnFailure(Cs1<Boolean> c) {
        return this.negated().afterAcceptOnSuccess(c);
    }

    default public Pr2<T1, T2> beforeRun(Rn r) {
        Objects.requireNonNull(r, "r is null");
        return (t1, t2) -> {
            r.run();
            return this.test(t1, t2);
        };
    }

    default public <B1, B2> Pr2<B1, B2> beforeApply(Fn2<? super B1, ? super B2, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        return this.beforeApply2(f);
    }

    default public <B1> Pr1<B1> beforeApply1(Fn1<? super B1, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return b1 -> this.tupled().test(Tuple.narrow((f.apply(b1))));
    }

    default public <B1, B2> Pr2<B1, B2> beforeApply2(Fn2<? super B1, ? super B2, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2))));
    }

    default public <B1, B2, B3> Pr3<B1, B2, B3> beforeApply3(Fn3<? super B1, ? super B2, ? super B3, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3))));
    }

    default public <B1, B2, B3, B4> Pr4<B1, B2, B3, B4> beforeApply4(Fn4<? super B1, ? super B2, ? super B3, ? super B4, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4))));
    }

    default public <B1, B2, B3, B4, B5> Pr5<B1, B2, B3, B4, B5> beforeApply5(Fn5<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5))));
    }

    default public <B1, B2, B3, B4, B5, B6> Pr6<B1, B2, B3, B4, B5, B6> beforeApply6(Fn6<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7> Pr7<B1, B2, B3, B4, B5, B6, B7> beforeApply7(Fn7<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7))));
    }

    default public <B1, B2, B3, B4, B5, B6, B7, B8> Pr8<B1, B2, B3, B4, B5, B6, B7, B8> beforeApply8(Fn8<? super B1, ? super B2, ? super B3, ? super B4, ? super B5, ? super B6, ? super B7, ? super B8, ? extends Tuple2<? extends T1, ? extends T2>> f) {
        Objects.requireNonNull(f, "f is null");
        return (b1, b2, b3, b4, b5, b6, b7, b8) -> this.tupled().test(Tuple.narrow((f.apply(b1, b2, b3, b4, b5, b6, b7, b8))));
    }

    default public Pr2<T1, T2> beforeTestOnSuccess(Pr0 p, Pr2<? super T1, ? super T2> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2) -> p.test() ? this.test(t1, t2) : onFailure.test(t1, t2);
    }

    default public Pr2<T1, T2> beforeTestOnSuccess(Pr0 p, Sp<? extends Boolean> onFailure) {
        return this.beforeTestOnSuccess(p, Pr2.fromSupplier(onFailure));
    }

    default public Pr2<T1, T2> beforeTestOnSuccess(Pr0 p, Boolean onFailure) {
        return this.beforeTestOnSuccess(p, Pr2.value(onFailure));
    }

    default public Pr2<T1, T2> beforeTestOnSuccess(Pr0 p) {
        return this.beforeTestOnSuccess(p, Pr2.empty());
    }

    default public Pr2<T1, T2> beforeTestOnFailure(Pr0 p, Pr2<? super T1, ? super T2> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeTestOnSuccess(p.negated(), onSuccess);
    }

    default public Pr2<T1, T2> beforeTestOnFailure(Pr0 p, Sp<? extends Boolean> onSuccess) {
        return this.beforeTestOnFailure(p, Pr2.fromSupplier(onSuccess));
    }

    default public Pr2<T1, T2> beforeTestOnFailure(Pr0 p, Boolean onSuccess) {
        return this.beforeTestOnFailure(p, Pr2.value(onSuccess));
    }

    default public Pr2<T1, T2> beforeTestOnFailure(Pr0 p) {
        return this.beforeTestOnFailure(p, Pr2.empty());
    }

    default public Pr0 beforeGet(Sp<? extends Tuple2<? extends T1, ? extends T2>> s) {
        Objects.requireNonNull(s, "s is null");
        return () -> this.tupled().test(Tuple.narrow((s.get())));
    }

    default public Pr2<T2, T1> inverted() {
        return (t2, t1) -> this.test(t1, t2);
    }

    default public <S> Pr2<T1, T2> afterPassingThroughApplyOn(Fn2<? super T1, ? super T2, ? extends S> onSuccess, Fn2<? super T1, ? super T2, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2) -> {
            boolean result = this.test(t1, t2);
            Fn2.narrow(result ? onSuccess : onFailure).apply(t1, t2);
            return result;
        };
    }

    default public <S> Fn2<T1, T2, S> afterPassingThroughApplyOnTo(Fn2<? super T1, ? super T2, ? extends S> onSuccess, Fn2<? super T1, ? super T2, ? extends S> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2) -> Fn2.narrow(this.test(t1, t2) ? onSuccess : onFailure).apply(t1, t2);
    }

    default public Pr2<T1, T2> afterPassingThroughAcceptOn(Cs2<? super T1, ? super T2> onSuccess, Cs2<? super T1, ? super T2> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2) -> {
            boolean result = this.test(t1, t2);
            Cs2.narrow(result ? onSuccess : onFailure).accept(t1, t2);
            return result;
        };
    }

    default public Cs2<T1, T2> afterPassingThroughAcceptOnTo(Cs2<? super T1, ? super T2> onSuccess, Cs2<? super T1, ? super T2> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2) -> Cs2.narrow(this.test(t1, t2) ? onSuccess : onFailure).accept(t1, t2);
    }

    default public Pr2<T1, T2> afterPassingThroughTestOn(Pr2<? super T1, ? super T2> onSuccess, Pr2<? super T1, ? super T2> onFailure) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2) -> Pr2.narrow(this.test(t1, t2) ? onSuccess : onFailure).test(t1, t2);
    }

    default public <S> Pr2<T1, T2> afterPassingThroughApply(Fn2<? super T1, ? super T2, ? extends S> f) {
        return this.afterPassingThroughApplyOn(f, f);
    }

    default public <S> Fn2<T1, T2, S> afterPassingThroughApplyTo(Fn2<? super T1, ? super T2, ? extends S> f) {
        return this.afterPassingThroughApplyOnTo(f, f);
    }

    default public Pr2<T1, T2> afterPassingThroughAccept(Cs2<? super T1, ? super T2> c) {
        return this.afterPassingThroughAcceptOn(c, c);
    }

    default public Cs2<T1, T2> afterPassingThroughAcceptTo(Cs2<? super T1, ? super T2> c) {
        return this.afterPassingThroughAcceptOnTo(c, c);
    }

    default public Pr2<T1, T2> afterPassingThroughTest(Pr2<? super T1, ? super T2> p) {
        return this.afterPassingThroughTestOn(p, p);
    }

    default public <S> Pr2<T1, T2> afterSuccessPassingThroughApply(Fn2<? super T1, ? super T2, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOn(onSuccess, Fn2.empty());
    }

    default public <S> Fn2<T1, T2, S> afterSuccessPassingThroughApplyTo(Fn2<? super T1, ? super T2, ? extends S> onSuccess) {
        return this.afterPassingThroughApplyOnTo(onSuccess, Fn2.empty());
    }

    default public Pr2<T1, T2> afterSuccessPassingThroughAccept(Cs2<? super T1, ? super T2> onSuccess) {
        return this.afterPassingThroughAcceptOn(onSuccess, Cs2.empty());
    }

    default public Cs2<T1, T2> afterSuccessPassingThroughAcceptTo(Cs2<? super T1, ? super T2> onSuccess) {
        return this.afterPassingThroughAcceptOnTo(onSuccess, Cs2.empty());
    }

    default public Pr2<T1, T2> afterSuccessPassingThroughTest(Pr2<? super T1, ? super T2> onSuccess) {
        return this.afterPassingThroughTestOn(onSuccess, Pr2.empty());
    }

    default public <S> Pr2<T1, T2> afterFailurePassingThroughApply(Fn2<? super T1, ? super T2, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApply(onFailure);
    }

    default public <S> Fn2<T1, T2, S> afterFailurePassingThroughApplyTo(Fn2<? super T1, ? super T2, ? extends S> onFailure) {
        return this.negated().afterSuccessPassingThroughApplyTo(onFailure);
    }

    default public Pr2<T1, T2> afterFailurePassingThroughAccept(Cs2<? super T1, ? super T2> onFailure) {
        return this.negated().afterSuccessPassingThroughAccept(onFailure);
    }

    default public Cs2<T1, T2> afterFailurePassingThroughAcceptTo(Cs2<? super T1, ? super T2> onFailure) {
        return this.negated().afterSuccessPassingThroughAcceptTo(onFailure);
    }

    default public Pr2<T1, T2> afterFailurePassingThroughTest(Pr2<? super T1, ? super T2> onFailure) {
        return this.negated().afterSuccessPassingThroughTest(onFailure);
    }

    default public <R> Pr2<T1, T2> beforePassingThroughApply(Fn2<? super T1, ? super T2, ? extends R> f) {
        Objects.requireNonNull(f, "f is null");
        return (t1, t2) -> {
            f.apply(t1, t2);
            return this.test(t1, t2);
        };
    }

    default public Pr2<T1, T2> beforePassingThroughTest(Pr2<? super T1, ? super T2> p) {
        Objects.requireNonNull(p, "p is null");
        return (t1, t2) -> {
            p.test(t1, t2);
            return this.test(t1, t2);
        };
    }

    default public Pr2<T1, T2> beforePassingThroughAccept(Cs2<? super T1, ? super T2> c) {
        Objects.requireNonNull(c, "c is null");
        return (t1, t2) -> {
            c.accept(t1, t2);
            return this.test(t1, t2);
        };
    }

    default public Pr2<T1, T2> beforeSuccessPassingThroughTest(Pr2<? super T1, ? super T2> p, Pr2<? super T1, ? super T2> onFailure) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onFailure, "onFailure is null");
        return (t1, t2) -> p.test(t1, t2) ? this.test(t1, t2) : onFailure.test(t1, t2);
    }

    default public Pr2<T1, T2> beforeSuccessPassingThroughTest(Pr2<? super T1, ? super T2> p, Sp<? extends Boolean> onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Pr2.fromSupplier(onFailure));
    }

    default public Pr2<T1, T2> beforeSuccessPassingThroughTest(Pr2<? super T1, ? super T2> p, Boolean onFailure) {
        return this.beforeSuccessPassingThroughTest(p, Pr2.value(onFailure));
    }

    default public Pr2<T1, T2> beforeSuccessPassingThroughTest(Pr2<? super T1, ? super T2> p) {
        return this.beforeSuccessPassingThroughTest(p, Pr2.empty());
    }

    default public Pr2<T1, T2> beforeFailurePassingThroughTest(Pr2<? super T1, ? super T2> p, Pr2<? super T1, ? super T2> onSuccess) {
        Objects.requireNonNull(p, "p is null");
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return this.beforeSuccessPassingThroughTest(p.negated(), onSuccess);
    }

    default public Pr2<T1, T2> beforeFailurePassingThroughTest(Pr2<? super T1, ? super T2> p, Sp<? extends Boolean> onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Pr2.fromSupplier(onSuccess));
    }

    default public Pr2<T1, T2> beforeFailurePassingThroughTest(Pr2<? super T1, ? super T2> p, Boolean onSuccess) {
        return this.beforeFailurePassingThroughTest(p, Pr2.value(onSuccess));
    }

    default public Pr2<T1, T2> beforeFailurePassingThroughTest(Pr2<? super T1, ? super T2> p) {
        return this.beforeFailurePassingThroughTest(p, Pr2.empty());
    }

    default public Pr1<Tuple2<T1, T2>> tupled() {
        return tuple -> this.test(tuple._1(), tuple._2());
    }

    default public Fn1<T1, Pr1<T2>> currying() {
        return t1 -> t2 -> this.test(t1, t2);
    }

    default public Prc2<T1, T2> checked() {
        return this::test;
    }

    default public Pr2<T1, T2> negated() {
        return (t1, t2) -> !this.test(t1, t2);
    }

    default public Pr2<T1, T2> and(Pr2<? super T1, ? super T2> p) {
        return (t1, t2) -> this.test(t1, t2) && p.test(t1, t2);
    }

    default public Pr2<T1, T2> or(Pr2<? super T1, ? super T2> p) {
        return (t1, t2) -> this.test(t1, t2) || p.test(t1, t2);
    }

    default public Pr2<T1, T2> and(Pr0 p) {
        return (t1, t2) -> this.test(t1, t2) && p.test();
    }

    default public Pr2<T1, T2> or(Pr0 p) {
        return (t1, t2) -> this.test(t1, t2) || p.test();
    }

    default public <I1> Pr3<I1, T1, T2> ignoring1Lt() {
        return (i1, t1, t2) -> this.test(t1, t2);
    }

    default public <I1> Pr3<T1, T2, I1> ignoring1Rt() {
        return (t1, t2, i1) -> this.test(t1, t2);
    }

    default public <I1, I2> Pr4<I1, I2, T1, T2> ignoring2Lt() {
        return (i1, i2, t1, t2) -> this.test(t1, t2);
    }

    default public <I1, I2> Pr4<T1, T2, I1, I2> ignoring2Rt() {
        return (t1, t2, i1, i2) -> this.test(t1, t2);
    }

    default public <I1, I2, I3> Pr5<I1, I2, I3, T1, T2> ignoring3Lt() {
        return (i1, i2, i3, t1, t2) -> this.test(t1, t2);
    }

    default public <I1, I2, I3> Pr5<T1, T2, I1, I2, I3> ignoring3Rt() {
        return (t1, t2, i1, i2, i3) -> this.test(t1, t2);
    }

    default public <I1, I2, I3, I4> Pr6<I1, I2, I3, I4, T1, T2> ignoring4Lt() {
        return (i1, i2, i3, i4, t1, t2) -> this.test(t1, t2);
    }

    default public <I1, I2, I3, I4> Pr6<T1, T2, I1, I2, I3, I4> ignoring4Rt() {
        return (t1, t2, i1, i2, i3, i4) -> this.test(t1, t2);
    }

    default public <I1, I2, I3, I4, I5> Pr7<I1, I2, I3, I4, I5, T1, T2> ignoring5Lt() {
        return (i1, i2, i3, i4, i5, t1, t2) -> this.test(t1, t2);
    }

    default public <I1, I2, I3, I4, I5> Pr7<T1, T2, I1, I2, I3, I4, I5> ignoring5Rt() {
        return (t1, t2, i1, i2, i3, i4, i5) -> this.test(t1, t2);
    }

    default public <I1, I2, I3, I4, I5, I6> Pr8<I1, I2, I3, I4, I5, I6, T1, T2> ignoring6Lt() {
        return (i1, i2, i3, i4, i5, i6, t1, t2) -> this.test(t1, t2);
    }

    default public <I1, I2, I3, I4, I5, I6> Pr8<T1, T2, I1, I2, I3, I4, I5, I6> ignoring6Rt() {
        return (t1, t2, i1, i2, i3, i4, i5, i6) -> this.test(t1, t2);
    }

    default public Pr2<T1, T2> memoized() {
        return Function2.super.memoized()::apply;
    }

}
