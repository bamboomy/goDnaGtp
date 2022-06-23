package genetic;
import java.util.ArrayList;
class Thought41 extends Thought{
private static ArrayList<Thought41> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 872.1825591638571;
private double fd1 = 948.8909618733835;
private Thought fo0 = null;
private Thought fo1 = null;
Thought41 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought41 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought41 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought41 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought41 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought41 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought41 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought41 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought41 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought41 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought41 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought41 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought41 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought41 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought41 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought41 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought41 instance = new Thought41 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        Output.points[2][3] -= fd0;
        fb1 = !fb0;
        double ld0 = 62.3704755519937;
        fb1 = !fb0;
        double ld1 = 151.17954061788996;
        double ld2 = 46.98476888909432;
        fb1 = !fb0;
        fb1 = !fb0;
        boolean lb3 = true;
        boolean lb4 = true;
if(fo0 != null){
          fo0.m3(lb4, fb0, fb1, lb3);
}
if(fo1 != null){
          ld1 = fo1.m3(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1, lb4, fb0, fb1, lb3);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Thought lo5 = Thought12.getInstance(ld0, ld1, ld2, fd0, lb4, fb0, fb1, lb3);
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        Thought lo6 = Thought88.getInstance(ld0, ld1, ld2, fd0);
        boolean lb7 = false;
        double ld8 = 341.979407769102;
        lb4 = lb7 && fb0;
        fd0 = fd1 - ld0;
        Output.points[2][4] -= ld1;
        fb1 = ld2 < ld8;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab1) {
        fd0 = fd1 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
        boolean lb0 = false;
        Output.points[2][5] -= fd1;
        fb0 = fd0 < fd1;
        fd0 = fd1 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
        double ld2 = 617.2851471376258;
        for(int i0=0; i0<10; i0++){
            Thought lo3 = Thought39.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            Thought lo4 = Thought31.getInstance(fd0, fd1, ld2, fd0, fb0, fb1, lb0, lb1);
            Output.points[2][6] -= fd1;
            boolean lb5 = true;
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    fb0 = ad4 > fd0;
    fd1 *= -1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = ad4 > fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, ad1, ad2, ad3);
}
        ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    double ld0 = 884.8275535392478;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ld0;
    fb1 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    double ld2 = 935.7006558094198;
    for(int i0=0; i0<10; i0++){
        Thought lo3 = Thought36.getInstance(fo1, fo0, fo1, fo0);
        fb0 = ld2 > ad1;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    lb0 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = ad1 < ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    Thought lo1 = Thought35.getInstance(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    lb0 = ad1 < ad2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    ad2 = ad3 + ad4;
    fb1 = lb0 && fb0;
    fd0 = fd1 + ad1;
    fb1 = lb0 || fb0;
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo1.m3();
}
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0);
}
    fb1 = fd1 < ad1;
    boolean lb2 = false;
    ad2 = ad3 + ad4;
    lb0 = !lb2;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
          ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb1 = ab1 || ab2;
    double ld0 = 846.0829188714108;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - ld0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + ld0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 || ab1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[2][7] -= ld0;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd0 *= -1;
    Thought lo1 = Thought49.getInstance(fd1, ld0, fd0, fd1);
    double ld2 = 47.73989992495694;
    ld0 *= -1;
    fb1 = ab1 || ab2;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 444.59755768927573;
    Thought lo1 = Thought24.getInstance(ab1, ab2, ab3, ab4);
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
    double ld2 = 987.6863207681624;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    Thought lo3 = Thought82.getInstance(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
if(ao3 != null){
      ao3.m2();
}
    ab2 = ab3 || ab4;
    fb0 = fd0 < fd1;
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
if(ao4 != null){
      ld0 = ao4.m3(ld2, ad1, ad2, ad3);
}
    fb1 = !ab1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    double ld0 = 829.3620926648119;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
}
    boolean lb2 = true;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
    fd1 = ld0 - fd0;
    fb0 = !fb1;
    lb1 = !lb2;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, ld0, fd0, fd1, fb1, lb1, lb2, fb0);
}
    boolean lb3 = true;
    Thought lo4 = Thought0.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb1, lb2, lb3);
}

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    Thought lo1 = Thought11.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo0.m1();
}

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
if(fo0 != null){
      fo0.m3(lb0, fb0, fb1, lb0);
}
    double ld1 = 33.25541454234601;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = ad4 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = ld1 < ad1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fd1 = ld1 + ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, ad1);
}
if(fo1 != null){
      fo1.m3(fb1, lb0, lb2, fb0);
}
    if (fb1) {
        Output.points[2][8] -= ad2;
        lb0 = ad3 > ad4;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb0);
}
        double ld3 = 663.4509126207593;
        } else if (lb2) {
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    Output.points[3][0] += ad4;
    Thought lo0 = Thought76.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[3][1] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ad4 = fo0.m3();
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    ab4 = !fb0;
    fb1 = lb1 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb1 = ad1 < ad2;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, ab1);
}
    boolean lb2 = false;
    ab1 = ad2 > ad3;
    ab2 = ad4 > fd0;
    if (ab3) {
        Thought lo3 = Thought10.getInstance(fo1, fo0, fo1, fo0);
        boolean lb4 = false;
if(fo1 != null){
          fo1.m2(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
        lb4 = ad4 < fd0;
        lb1 = !lb2;
}
Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
if(ao3 != null){
      lb0 = ao3.m2(fb0, fb1, lb0, fb0);
}
    double ld1 = 660.7077922351872;
    fb1 = ld1 < fd0;
    lb0 = fd1 < ld1;
        fd0 *= -1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1);
}
    boolean lb2 = true;
    Thought lo3 = Thought40.getInstance(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, lb2, fb0, fb1, lb0);
    lb2 = fd0 > fd1;
    Output.points[3][2] += ld1;
    Output.points[3][3] -= fd0;
    boolean lb4 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb4, fb0, fb1, lb0);
}
    fd1 *= -1;

Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    boolean lb0 = true;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
    fb0 = ad2 > ad3;
if(ao1 != null){
      ao1.m1();
}
    Output.points[3][4] += ad4;
    fd0 *= -1;
    fb1 = fd1 > ad1;
    lb0 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    double ld1 = 296.00192924744505;
if(ao4 != null){
      ao3 = ao4.m4(lb0, fb0, fb1, lb0);
}
    double ld2 = 231.47981811098302;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought51.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Thought lo1 = Thought92.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    boolean lb2 = true;
    ab3 = !ab4;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    boolean lb3 = true;
    double ld4 = 612.1333197722621;
    boolean lb5 = false;
if(fo1 != null){
      fo1.m3();
}
        double ld6 = 318.97721150064257;
    ab3 = ld4 < ld6;
    boolean lb7 = false;

Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab2 = ao1.m2(ad1, ad2, ad3, ad4);
}
    boolean lb0 = false;
if(ao2 != null){
      fd0 = ao2.m3(ab2, ab3, ab4, fb0);
}
    Output.points[3][5] -= fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    Output.points[3][6] += fd0;
    fd1 = ad1 - ad2;
    double ld1 = 777.5842524058569;
    ad2 *= -1;
    fb1 = lb0 || ab1;
    ad3 *= -1;
    ad4 = fd0 + fd1;

Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    Output.points[3][7] += fd1;
    Output.points[3][8] += fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[4][0] -= fd1;
    Output.points[4][1] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought65.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought37.getInstance();
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought67.getInstance(ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    boolean lb1 = true;
    ab3 = ab4 && fb0;
    fb1 = lb1 || ab1;
    fd1 *= -1;
    ab2 = fd0 > fd1;
    boolean lb2 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought48.getInstance(fd1, fd0, fd1, fd0, lb1, lb2, ab1, ab2);
    double ld4 = 681.928037880618;
if(fo1 != null){
      fd0 = fo1.m3();
}
    double ld5 = 147.19469944883042;
    boolean lb6 = true;
    fd0 = fd1 + ld4;
if(fo1 != null){
      fo0 = fo1.m4(ld5, fd0, fd1, ld4);
}
    if (ab2) {
        Thought lo7 = Thought51.getInstance(ab3, ab4, fb0, fb1);
        double ld8 = 342.7216392445522;
}
Thought.STACK_COUNTER++;
return ld5;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
        ad1 = ad2 + ad3;
    fb0 = ad4 < fd0;
    fd1 = ad1 + ad2;
    double ld0 = 554.2676214383347;
    fb1 = !fb0;
    fb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Output.points[4][2] += fd1;
    boolean lb1 = true;
    ld0 *= -1;
    lb1 = ad1 < ad2;
    Output.points[4][3] -= ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    Output.points[4][4] -= ad1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
    lb1 = !fb0;
    boolean lb2 = false;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought29.getInstance(fo0, fo1, fo0, fo1);
    if (ab1) {
        boolean lb1 = false;
        Thought lo2 = Thought58.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
        fb0 = fb1 && lb1;
        boolean lb3 = false;
        fd0 *= -1;
        fd1 = ad1 - ad2;
        ad3 = ad4 + fd0;
        boolean lb4 = false;
        fd1 = ad1 + ad2;
        lb3 = ad3 > ad4;
        lb4 = fd0 < fd1;
        Thought lo5 = Thought92.getInstance();
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
        Thought lo6 = Thought32.getInstance(ab1, ab2, ab3, ab4);
        fd0 *= -1;
        fb0 = !fb1;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb1, lb3, lb4, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ad3 = ad4 + fd0;
        boolean lb7 = false;
        fb0 = fd1 < ad1;
}
Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    lb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    fb1 = lb0 || fb0;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    boolean lb2 = true;
if(ao4 != null){
      fd1 = ao4.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    lb2 = !fb0;
    fb1 = fd0 < fd1;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 > ad3;
if(ao1 != null){
      ad4 = ao1.m3(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, lb0, fb0, fb1, lb0);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4);
}
    if (fb0) {
        Output.points[4][5] += fd1;
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          fd1 = fo1.m3();
}
        Output.points[4][6] += ad1;
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
          lb0 = ao3.m2(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
        ad4 = fd0 - fd1;
        boolean lb1 = true;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb0);
}
        Thought lo2 = Thought93.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb1, lb0);
        fd0 = fd1 + ad1;
if(ao2 != null){
          ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
        boolean lb3 = false;
if(ao1 != null){
          ad3 = ao1.m3(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb1);
}
        ad2 = ad3 + ad4;
        fd0 = fd1 - ad1;
if(ao3 != null){
          ao2 = ao3.m4();
}
}
Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Thought lo0 = Thought60.getInstance(fd0, fd1, fd0, fd1);
    double ld1 = 724.8006026598435;
if(ao2 != null){
      ld1 = ao2.m3(ab2, ab3, ab4, fb0);
}
    double ld2 = 196.5083409003975;
    Thought lo3 = Thought68.getInstance(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld1);
if(ao1 != null){
      ld2 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ld2, fb1, ab1, ab2, ab3);
}
        fd0 = fd1 + ld1;
    boolean lb4 = true;
if(fo1 != null){
      ld2 = fo1.m3(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    lb4 = ab1 || ab2;
    boolean lb5 = true;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
if(ao1 != null){
      fb0 = ao1.m2(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = ad1 + ad2;
    ab4 = ad3 > ad4;
    fd0 *= -1;
if(ao2 != null){
      fb0 = ao2.m2();
}
    fd1 = ad1 + ad2;
    boolean lb0 = true;
    Output.points[4][7] += ad3;
    Thought lo1 = Thought5.getInstance(ad4, fd0, fd1, ad1);
if(ao3 != null){
      fb0 = ao3.m2(fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
    ab1 = !ab2;
    ad4 = fd0 - fd1;
    ab3 = ad1 > ad2;
        Output.points[4][8] += ad3;
    double ld2 = 320.67283350196834;
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab4 = ad3 > ad4;
if(ao2 != null){
      ao2.m3(fd0, fd1, ld2, ad1, fb0, fb1, lb0, ab1);
}

Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
        fb0 = fd0 > fd1;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    fb0 = fb1 || lb0;
    fb0 = fd1 > fd0;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
    boolean lb2 = false;
    fd1 *= -1;
    fd0 *= -1;
    Thought lo3 = Thought65.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb1, lb2, fb0, fb1);
}
    fd1 = fd0 - fd1;
    double ld4 = 564.355031170555;
    ld4 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, ld4, fd0, lb1, lb2, fb0, fb1);
}
    fd1 = ld4 - fd0;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought65.getInstance(ab4, fb0, fb1, ab1);
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought63.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
        boolean lb2 = false;
        fd1 *= -1;
        Thought lo3 = Thought36.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
        boolean lb4 = true;
        ab4 = fb0 || fb1;
        Output.points[5][0] += fd0;
        lb2 = !lb4;
        Thought lo5 = Thought54.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
        double ld6 = 217.40345564653174;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld6, fd0, lb2, lb4, ab1, ab2);
}
        double ld7 = 964.3943703988919;
if(fo0 != null){
          fd0 = fo0.m3();
}
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb0);
}
    ad4 = fd0 - fd1;
    ad1 *= -1;
    Thought lo2 = Thought25.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    if (lb1) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
        fb0 = fb1 || lb0;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    boolean lb0 = true;
    fd1 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
    ab2 = fd1 > ad1;
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought71.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld2 = 248.556556084792;
    ab1 = ad3 < ad4;
    double ld3 = 24.55665439418095;
    ad4 *= -1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought12.getInstance();
if(ao3 != null){
      ao3.m2(fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(ao4 != null){
      ao4.m3(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    double ld2 = 457.32357661523685;
    lb1 = ld2 > fd0;
    boolean lb3 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld2);
}
    boolean lb4 = false;
    boolean lb5 = true;
    boolean lb6 = true;
    boolean lb7 = true;
    lb3 = fd0 < fd1;
    lb4 = lb5 && lb6;
    lb7 = ld2 > fd0;
    fd1 = ld2 - fd0;
    double ld8 = 432.9218563487541;
    boolean lb9 = false;
    Output.points[5][1] -= fd0;

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Output.points[5][2] -= ad2;
    lb0 = ad3 > ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    ad3 = ad4 - fd0;
    lb0 = fb0 || fb1;
    Output.points[5][3] += fd1;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    lb0 = fb0 || fb1;
    ad1 = ad2 - ad3;
    lb0 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    Thought lo1 = Thought0.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    fb1 = lb0 && fb0;
    fb1 = !lb0;
    Output.points[5][4] -= ad3;
    fb0 = fb1 || lb0;
    Thought lo2 = Thought87.getInstance(fb0, fb1, lb0, fb0);

Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 983.2481743951492;
    boolean lb1 = true;
    double ld2 = 970.3057682105297;
    Thought lo3 = Thought38.getInstance(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld0);
    Thought lo4 = Thought48.getInstance(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld0, lb1, ab1, ab2, ab3);
    ab4 = !fb0;
    fb1 = lb1 && ab1;
    Thought lo5 = Thought81.getInstance(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
    double ld6 = 963.7693127700893;
    fb1 = !lb1;

Thought.STACK_COUNTER++;
return ao1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    ab2 = !ab3;
    ad2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ad1 = ad2 - ad3;
if(ao3 != null){
      ab2 = ao3.m2();
}
    boolean lb0 = true;
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ad3 = fo0.m3(ab2, ab3, ab4, fb0);
}
    ad4 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
    ab3 = ad4 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ab1 = fd1 > ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo1.m1(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1);
}
    fb1 = ad1 < ad2;
if(fo0 != null){
      fo0.m3(lb0, ab1, ab2, ab3);
}
    ad3 = ad4 - fd0;
    Thought lo1 = Thought2.getInstance(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
    Output.points[5][5] += ad2;
    double ld2 = 519.0899940946767;
    ad2 = ad3 + ad4;

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    boolean lb0 = true;
    lb0 = fb0 && fb1;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought37.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
    Thought lo2 = Thought56.getInstance();
    fb1 = lb0 || fb0;
    fb1 = fd0 < fd1;
    boolean lb3 = false;
    Thought lo4 = Thought15.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb3, fb0, fb1);
}
    lb0 = lb3 && fb0;
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb0);
}
    double ld5 = 520.1296392361007;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Output.points[5][6] -= fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    double ld0 = 904.9455128121228;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fd1 = ld0 + fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
    Output.points[5][7] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought61.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    boolean lb1 = true;
    Output.points[5][8] -= fd1;
    Output.points[6][0] += fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    fb1 = fd1 < fd0;
    double ld2 = 794.9133174080629;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
