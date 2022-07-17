package genetic;
import java.util.ArrayList;
class Thought36 extends Thought{
private static ArrayList<Thought36> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 619.9346075481778;
private double fd1 = 32.44501992268814;
private Thought fo0 = null;
private Thought fo1 = null;
Thought36 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought36 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought36 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought36 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought36 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought36 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought36 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought36 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought36 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought36 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought36 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought36 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought36 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought36 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought36 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought36 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb1 = fb0 || fb1;
    Thought lo0 = Thought262.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;

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
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 > fd0;
        boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        ab1 = fd1 < fd0;
        Output.points[6][4] += fd1;
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2();
}
        lb0 = !ab1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo0.m1(fb1, lb0, ab1, ab2);
}
        fd0 *= -1;
        }
    ab3 = !ab4;
    Thought lo1 = Thought346.getInstance(fo1, fo0, fo1, fo0);
    fd1 *= -1;

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
    fb1 = fb0 || fb1;
    double ld0 = 636.2283046750753;
    Thought lo1 = Thought202.getInstance(ld0, ad1, ad2, ad3);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    fb0 = ad1 < ad2;
    fb1 = !fb0;
    fb1 = !fb0;
    ad3 = ad4 + fd0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
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
    boolean lb0 = false;
    if (ab1) {
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        double ld1 = 10.039037908771666;
        Thought lo2 = Thought283.getInstance();
        ad1 *= -1;
        ad2 = ad3 - ad4;
        fd0 = fd1 + ld1;
        Output.points[6][5] -= ad1;
        ad2 = ad3 - ad4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
          ab4 = fo0.m2(fb0, fb1, lb0, ab1);
}
        ab2 = ab3 || ab4;
        Output.points[6][6] -= ad2;
        for(int i0=0; i0<10; i0++){
            fb0 = ad3 > ad4;
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1);
}
            fd0 = fd1 + ld1;
            fb1 = ad1 < ad2;
            Thought lo3 = Thought311.getInstance(ad3, ad4, fd0, fd1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
        fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought372.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Output.points[6][7] -= fd0;
    boolean lb1 = true;
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    lb2 = fd0 < fd1;
    boolean lb3 = false;

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
    fb0 = ad1 > ad2;
    boolean lb0 = false;
    Thought lo1 = Thought139.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
    ad3 *= -1;
    for(int i0=0; i0<10; i0++){
        ad4 *= -1;
        boolean lb2 = true;
        fb0 = !fb1;
        fd0 = fd1 - ad1;
        lb2 = lb0 || fb0;
        double ld3 = 67.57240899143234;
        fb1 = !lb2;
if(fo0 != null){
          lb0 = fo0.m2();
}
        fb0 = fb1 || lb2;
        Thought lo4 = Thought274.getInstance(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb2);
if(fo0 != null){
          ao4 = fo0.m4(lb0, fb0, fb1, lb2);
}
        Thought lo5 = Thought238.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
          lb0 = ao4.m2(fd0, fd1, ld3, ad1);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ab3 = fd0 < fd1;
    Output.points[6][8] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    ab4 = fd0 > fd1;
    fd0 = fd1 - fd0;
    Output.points[7][0] += fd1;
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought22.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, ab1, ab2, ab3);
}
        fd0 *= -1;
    boolean lb1 = false;
    double ld2 = 611.086735708521;
    ab3 = ab4 || fb0;
    fb1 = lb1 && ab1;
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m3(fd0, fd1, ld2, ad1);
}
    ab3 = !ab4;
    boolean lb3 = true;
    ad2 *= -1;
    ad3 = ad4 + fd0;
    boolean lb4 = true;
    ab3 = fd1 > ld2;
    ad1 *= -1;
    ad2 *= -1;
    ab4 = ad3 > ad4;
    boolean lb5 = true;

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
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    if (fb0) {
        fb1 = fb0 && fb1;
        fb0 = fd0 > fd1;
        fd0 = fd1 + fd0;
        fb1 = fd1 < fd0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        boolean lb0 = true;
        lb0 = fd1 > fd0;
        fd1 = fd0 - fd1;
        fd0 *= -1;
        double ld1 = 503.5043042415706;
        fb0 = !fb1;
        Output.points[7][1] += fd0;
        lb0 = fb0 || fb1;
        fd1 = ld1 + fd0;
        fd1 = ld1 - fd0;
        Thought lo2 = Thought355.getInstance();
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
        fd0 = fd1 - ld1;
        } else {
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab2 = ab3 || ab4;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
    if (ab3) {
        double ld0 = 945.3090235359281;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
        fb0 = fd1 < ld0;
        fb1 = lb1 || ab1;
        boolean lb2 = true;
        Thought lo3 = Thought62.getInstance(ab1, ab2, ab3, ab4);
        Output.points[7][2] -= fd0;
        fd1 = ld0 - fd0;
        fd1 *= -1;
        ld0 = fd0 - fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m3(ld0, fd0, fd1, ld0);
}
        fd0 = fd1 + ld0;
        Thought lo4 = Thought77.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
if(fo0 != null){
          fd1 = fo0.m3(ld0, fd0, fd1, ld0, fb0, fb1, lb1, lb2);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
}
Thought.STACK_COUNTER++;
return ab1;
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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld1 = 716.6107569884624;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3);
}
    double ld2 = 958.132354544379;
    ad3 = ad4 + fd0;
    Output.points[7][3] += fd1;
    Output.points[7][4] += ld1;
    ld2 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ld1 = ld2 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    boolean lb3 = false;
    Output.points[7][5] += fd1;
if(fo0 != null){
      ld1 = fo0.m3();
}
    boolean lb4 = false;
    Output.points[7][6] += ld2;
    lb4 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb0, lb3, lb4, fb0);
}
    if (fb1) {
if(fo0 != null){
          fd0 = fo0.m3(lb0, lb3, lb4, fb0);
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[7][7] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    ab4 = ad4 < fd0;
if(fo0 != null){
      fb0 = fo0.m2();
}
        if (fb1) {
        fd1 = ad1 + ad2;
        Thought lo0 = Thought224.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
        double ld1 = 935.8169472995282;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(ld1, ad1, ad2, ad3);
}
        ab2 = ad4 > fd0;
        ab3 = fd1 > ld1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fd0 = fd1 + ld1;
        ad1 *= -1;
        } else if (fb0) {
        fb1 = ad3 > ad4;
}
Thought.STACK_COUNTER++;
return ab1;
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
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 843.7150675380037;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb1 = true;
    Thought lo2 = Thought366.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
    fb1 = !lb1;
    fb0 = ld0 < fd0;
    Thought lo3 = Thought193.getInstance(fb1, lb1, fb0, fb1);
    fd1 = ld0 - fd0;
    fd1 = ld0 - fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 + ld0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
}

Thought.STACK_COUNTER++;
return lb1;
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
    ad1 = ad2 + ad3;
        for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
        fb0 = fb1 && fb0;
        boolean lb0 = false;
        boolean lb1 = true;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, fb0, fb1, lb0);
}
        boolean lb2 = false;
if(fo0 != null){
          ao4 = fo0.m4();
}
        lb1 = lb2 && fb0;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb1, lb0, lb1, lb2);
}
        fd1 = ad1 - ad2;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
        lb2 = ad3 > ad4;
        fb0 = fb1 || lb0;
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
        lb1 = fd1 < ad1;
        lb2 = fb0 || fb1;
if(ao1 != null){
          fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
        boolean lb3 = true;
        fd1 *= -1;
        ad1 *= -1;
        lb0 = !lb1;
        ad2 = ad3 - ad4;
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
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    Output.points[7][8] -= fd1;
    ab2 = fd0 < fd1;
    double ld0 = 650.3689812352038;
    ld0 = fd0 + fd1;
if(ao2 != null){
      ao2.m2(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    fd0 = fd1 + ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, ab1, ab2);
}
    double ld1 = 286.9210867206842;
    ab3 = ld0 > ld1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    ab4 = fb0 && fb1;
    Output.points[8][0] -= fd0;
    fd1 *= -1;
if(fo0 != null){
      fo0.m1(ld0, ld1, fd0, fd1);
}
    boolean lb2 = false;
    lb2 = !ab1;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, ld1, fd0, fd1);
}
    double ld3 = 627.6867276943765;
    ab2 = ab3 || ab4;
    fb0 = ld0 < ld1;
    boolean lb4 = false;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 341.2230749312717;
    boolean lb1 = false;
    ab1 = ab2 || ab3;
    double ld2 = 504.63134294495705;
if(ao2 != null){
      ab4 = ao2.m2(ld0, ld2, ad1, ad2, fb0, fb1, lb1, ab1);
}
    ab2 = !ab3;
    boolean lb3 = true;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao2.m1();
}
        lb1 = lb3 && ab1;
    ab2 = ab3 || ab4;
    Thought lo4 = Thought105.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb3);
    ab1 = ld0 > ld2;
if(ao1 != null){
      ad1 = ao1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = lb1 && lb3;
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao2.m2(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ld0 *= -1;
if(ao3 != null){
      ld2 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fb1 = lb1 && lb3;
    Thought lo5 = Thought223.getInstance(fd0, fd1, ld0, ld2, ab1, ab2, ab3, ab4);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb1, lb3);
}
    ab1 = ad1 > ad2;
    ad3 = ad4 - fd0;

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
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = fd0 - fd1;
    fb0 = fb1 || fb0;
        fb1 = fb0 || fb1;
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fb0 = fd1 > fd0;
    Output.points[8][1] += fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}

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
    boolean lb0 = true;
    Output.points[8][2] += fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Output.points[8][3] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    Output.points[8][4] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, ab1);
}

Thought.STACK_COUNTER++;
return fd1;
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
    double ld0 = 333.9667092380984;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ld0 = ad1 + ad2;
    boolean lb1 = false;
    Output.points[8][5] -= ad3;
    ad4 *= -1;
    Thought lo2 = Thought255.getInstance(fd0, fd1, ld0, ad1);
    double ld3 = 423.84360384104406;
    fb0 = ad1 > ad2;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ld0 = ld3 - ad1;
    lb1 = ad2 < ad3;

Thought.STACK_COUNTER++;
return ad4;
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
    ad1 = ad2 + ad3;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    double ld0 = 698.3060285914667;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
        ld0 = ad1 - ad2;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}

Thought.STACK_COUNTER++;
return ad4;
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
    fb1 = !fb0;
    double ld0 = 633.2493243773362;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo1 = Thought363.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    if (fb1) {
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        boolean lb2 = true;
        lb2 = !fb0;
        fb1 = lb2 || fb0;
if(ao3 != null){
          ao3.m1(fd1, ld0, fd0, fd1);
}
        fb1 = ld0 > fd0;
        lb2 = fb0 || fb1;
        fd1 *= -1;
        Output.points[8][6] += ld0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
          ao4 = fo0.m4(fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb2);
}
        fb0 = ld0 > fd0;
if(fo1 != null){
          fd1 = fo1.m3(ao1, ao2, ao3, ao4, fb1, lb2, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(ao1 != null){
          ld0 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
          fo1.m3(fb0, fb1, lb2, fb0);
}
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
}
Thought.STACK_COUNTER++;
return ld0;
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
    boolean lb0 = true;
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    double ld1 = 35.40059895801697;
    Thought lo2 = Thought13.getInstance(ld1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
    ad1 = ad2 + ad3;
    fb1 = lb0 && fb0;
    ad4 *= -1;
    fd0 *= -1;
if(ao4 != null){
      fb1 = ao4.m2(lb0, fb0, fb1, lb0);
}
    boolean lb3 = true;
    lb3 = fb0 || fb1;
    fd1 = ld1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    lb0 = lb3 || fb0;
    fb1 = lb0 && lb3;
    fb0 = fb1 && lb0;
    lb3 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1);
}
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld1;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb1, lb0, lb3, fb0);
}

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought265.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
    boolean lb1 = true;
    boolean lb2 = true;
    ab4 = fd0 > fd1;
    fb0 = fb1 && lb1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    double ld3 = 781.4242385796872;
    lb2 = ld3 > fd0;
    double ld4 = 376.9606052443993;
    Output.points[8][7] += fd0;
    fd1 = ld3 - ld4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld3, ld4, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    Thought lo5 = Thought333.getInstance(fb0, fb1, lb1, lb2);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo6 = Thought2.getInstance(fd1, ld3, ld4, fd0);

Thought.STACK_COUNTER++;
return fd1;
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
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
}
    ab4 = ad3 > ad4;
    fb0 = fb1 || lb0;
    fd0 = fd1 - ad1;
    Thought lo1 = Thought222.getInstance(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
    if (fb0) {
if(ao2 != null){
          ad2 = ao2.m3();
}
        for(int i0=0; i0<10; i0++){
            ad3 = ad4 - fd0;
}}
Thought.STACK_COUNTER++;
return fd1;
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
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    Thought lo1 = Thought75.getInstance(lb0, fb0, fb1, lb0);
    if (fb0) {
        fd1 *= -1;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        Thought lo2 = Thought149.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
          lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fb0 = fb1 || lb0;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
        double ld3 = 126.67367500151451;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
    ab2 = fd0 < fd1;
    ab3 = fd0 < fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, lb1, ab1);
}
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    lb1 = ab1 || ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}

Thought.STACK_COUNTER++;
return fo0;
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
    fb1 = !fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 < fd1;
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    double ld1 = 226.61232885526317;
if(fo0 != null){
      ld1 = fo0.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    Output.points[8][8] += fd0;
    if (fb1) {
        } else {
        lb0 = fb0 && fb1;
        if (lb0) {
if(fo1 != null){
              fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
}}
Thought.STACK_COUNTER++;
return fo0;
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
      ad1 = fo1.m3();
}
    ab1 = ab2 || ab3;
    ad2 = ad3 + ad4;
    Thought lo0 = Thought257.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && lb1;
        Output.points[0][0] += fd0;
    ab1 = fd1 > ad1;
    ab2 = ad2 < ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, lb1, ab1, ab2, ab3);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld2 = 657.2423285842282;
if(fo0 != null){
      fo1 = fo0.m4(ld2, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;

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
    fd0 = fd1 - fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    double ld0 = 41.692031848769794;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought324.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fd1 = fo1.m3();
}
    boolean lb2 = true;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0, lb2, fb0, fb1, lb2);
}
    fd1 = ld0 - fd0;
    Thought lo3 = Thought186.getInstance(fb0, fb1, lb2, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb0 = ao1.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m3();
}
    fb1 = !fb0;
    fd0 *= -1;
    Thought lo0 = Thought249.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    Output.points[0][1] -= ad4;
    boolean lb1 = true;
if(ao1 != null){
      fd0 = ao1.m3(lb1, fb0, fb1, lb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
    fb0 = fb1 && lb1;

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
    double ld0 = 584.7990814301345;
    double ld1 = 438.07685925922675;
    boolean lb2 = true;
    Thought lo3 = Thought43.getInstance(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld0);
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(ld0, ld1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ld0 = ld1 - fd0;
    fb0 = fb1 || lb2;
if(fo1 != null){
      ab1 = fo1.m2(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    for(int i0=0; i0<10; i0++){
        ab1 = !ab2;
        ad1 = ad2 + ad3;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 || ab3;
        boolean lb0 = true;
        Thought lo1 = Thought25.getInstance(ab3, ab4, fb0, fb1);
        lb0 = ad2 > ad3;
if(ao4 != null){
          ab1 = ao4.m2(fo0, fo1, ao1, ao2);
}
        ab2 = !ab3;
        Thought lo2 = Thought369.getInstance(ad4, fd0, fd1, ad1);
        double ld3 = 750.5860939163207;
        Output.points[0][2] -= ad1;
        boolean lb4 = true;
        Output.points[0][3] += ad2;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
        ab3 = !ab4;
        boolean lb5 = false;
        ab4 = ld3 > ad1;
        fb0 = ad2 > ad3;
        ad4 = fd0 - fd1;
if(ao3 != null){
          ld3 = ao3.m3(ad1, ad2, ad3, ad4, fb1, lb0, lb4, lb5);
}
        double ld6 = 999.7745439060907;
        ab1 = ad4 < fd0;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
        fb1 = fd1 < ld3;
if(ao4 != null){
          ao3 = ao4.m4();
}
}
Thought.STACK_COUNTER++;
return fo0;
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
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[0][4] += fd1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
    fb1 = lb0 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb1 = lb0 || fb0;
    fb1 = !lb0;
    Output.points[0][5] += fd0;
    boolean lb1 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought168.getInstance(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
    boolean lb3 = true;
    lb1 = lb3 && fb0;

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
    Thought lo0 = Thought78.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    double ld1 = 992.1990742077699;
    ld1 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2();
}
    ld1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m2(fb0, fb1, fb0, fb1);
}
    fd1 = ld1 + fd0;
    Output.points[0][6] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought9.getInstance(ld1, fd0, fd1, ld1);
    fd0 = fd1 - ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    fb0 = fd1 < ld1;
    fd0 *= -1;
    fb1 = fd1 < ld1;
    fd0 = fd1 - ld1;
    Output.points[0][7] += fd0;
    fd1 = ld1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[0][8] += ld1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;

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
    fd0 = fd1 + fd0;
    Thought lo0 = Thought19.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    double ld1 = 299.27612507619784;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    Thought lo2 = Thought208.getInstance(fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
    ld1 = fd0 - fd1;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;

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
