package genetic;
import java.util.ArrayList;
class Thought83 extends Thought{
private static ArrayList<Thought83> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 120.85664105294032;
private double fd1 = 596.93933712112;
private Thought fo0 = null;
private Thought fo1 = null;
Thought83 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought83 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought83 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought83 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought83 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought83 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought83 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought83 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought83 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought83 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought83 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought83 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought83 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought83 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought83 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought83 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought83 instance = new Thought83 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 135.12137395085534;
    ld0 *= -1;
    boolean lb1 = false;
    boolean lb2 = false;
    Thought lo3 = Thought74.getInstance(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb1);
    boolean lb4 = false;
if(fo0 != null){
      lb2 = fo0.m2(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(lb4, fb0, fb1, lb1);
}
    Output.points[1][3] += ld0;
    lb2 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    for(int i0=0; i0<10; i0++){
        Output.points[1][4] -= ld0;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld0, fd0, lb4, fb0, fb1, lb1);
}
        fd1 = ld0 - fd0;
        lb2 = !lb4;
        fb0 = fd1 < ld0;
        boolean lb5 = false;
        boolean lb6 = false;
        Thought lo7 = Thought81.getInstance(fo1, fo0, fo1, fo0);
        fd0 *= -1;
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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    double ld0 = 703.0286179521175;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ld0 *= -1;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, fd0);
}
    ab3 = !ab4;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(fo0 != null){
      fo0.m3();
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    Output.points[1][5] += fd1;
    Thought lo1 = Thought7.getInstance(fo0, fo1, fo0, fo1);
    ab3 = !ab4;

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
    Thought lo0 = Thought6.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fb0 = fb1 && fb0;
    if (fb1) {
        boolean lb1 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
        fb0 = !fb1;
        lb1 = fb0 || fb1;
        boolean lb2 = false;
        Thought lo3 = Thought69.getInstance(fd0, fd1, ad1, ad2);
        ad3 = ad4 + fd0;
        boolean lb4 = true;
        fd1 *= -1;
        lb1 = ad1 > ad2;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          ad1 = fo1.m3(lb2, lb4, fb0, fb1);
}
if(fo0 != null){
          lb1 = fo0.m2();
}
        } else {
        ad2 = ad3 - ad4;
        if (fb1) {
            fb0 = !fb1;
if(fo0 != null){
              fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
            Output.points[1][6] -= ad3;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 - ad4;
        Output.points[1][7] -= fd0;
        ab1 = fd1 < ad1;
        ab2 = ab3 && ab4;
        boolean lb0 = true;
        ad2 = ad3 + ad4;
        boolean lb1 = true;
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fd0 = fd1 + ad1;
        Thought lo2 = Thought19.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
        boolean lb3 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb3, ab1, ab2);
}
        fd1 = ad1 - ad2;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
        ab3 = !ab4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
        lb3 = ab1 || ab2;
if(fo0 != null){
          fd0 = fo0.m3();
}
        ab3 = ab4 && fb0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb1, lb0, lb1, lb3);
}
        boolean lb4 = true;
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
    fb1 = fd1 > fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    Thought lo0 = Thought72.getInstance(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    fb0 = !fb1;
    Output.points[1][8] += fd1;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1);
}
    lb1 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd0 = fo1.m3(lb1, fb0, fb1, lb1);
}
if(ao1 != null){
          fd1 = ao1.m3();
}
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
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
    fb1 = ad1 < ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 < ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld0 = 7.174994283933632;
    Output.points[2][0] += ld0;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m3(ad2, ad3, ad4, fd0);
}
    boolean lb1 = false;
    Thought lo2 = Thought80.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2);
    Thought lo3 = Thought65.getInstance(fb0, fb1, lb1, fb0);
    Thought lo4 = Thought18.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, fb0);
}
    ld0 = ad1 - ad2;
if(ao3 != null){
      ao3.m3(ad3, ad4, fd0, fd1);
}
    fb1 = lb1 && fb0;
    fb1 = !lb1;
    boolean lb5 = true;
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    lb5 = fb0 || fb1;
    lb1 = lb5 && fb0;

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
if(ao1 != null){
      fd1 = ao1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    ab1 = !ab2;
    boolean lb0 = false;
    boolean lb1 = true;
    Output.points[2][1] += fd0;
    Output.points[2][2] -= fd1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
if(ao3 != null){
          ao2 = ao3.m4();
}
        fd1 *= -1;
        fd0 = fd1 - fd0;
        double ld2 = 739.4038206086755;
        boolean lb3 = true;
        lb1 = ab1 && ab2;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, ld2, fd0, ab3, ab4, fb0, fb1);
}
        fd1 = ld2 - fd0;
        Thought lo4 = Thought55.getInstance(fo1, ao1, ao2, ao3);
        boolean lb5 = true;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2, lb3, lb5, lb0, lb1);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2(ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
    Output.points[2][3] -= fd1;
    Output.points[2][4] -= ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    ab2 = !ab3;
    ab4 = fd1 < ad1;
    ad2 = ad3 + ad4;
    fb0 = fd0 > fd1;
    Output.points[2][5] += ad1;
    double ld1 = 484.30014809059213;
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 || ab1;
        ad1 = ad2 + ad3;
        Output.points[2][6] -= ad4;
if(ao2 != null){
          ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
          fd0 = ao3.m3();
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    Thought lo2 = Thought40.getInstance(fo0, fo1, fo0, fo1);
    lb1 = fb0 && fb1;
    Thought lo3 = Thought16.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(lb1, fb0, fb1, lb0);
}
if(fo1 != null){
      lb1 = fo1.m2();
}
    fb0 = fd0 < fd1;
    boolean lb4 = true;
    Output.points[2][7] += fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb4);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[2][8] -= fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb4);
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
    boolean lb0 = false;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    double ld1 = 425.4202920458325;
    fd0 = fd1 - ld1;
    fb0 = !fb1;
    lb0 = ab1 || ab2;
    fd0 = fd1 - ld1;
    ab3 = !ab4;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 + fd0;
    Thought lo2 = Thought42.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, ab1, ab2);
}
    ld1 *= -1;
if(fo1 != null){
      fo1.m1();
}
    fd0 = fd1 - ld1;
    ab3 = fd0 > fd1;
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld1, fd0, ab4, fb0, fb1, lb0);
}
    ab1 = fd1 > ld1;
    Thought lo3 = Thought95.getInstance(fo1, fo0, fo1, fo0);
    ab2 = ab3 && ab4;
    boolean lb4 = false;
    ab4 = fd0 > fd1;
    boolean lb5 = true;
    ld1 = fd0 + fd1;
    ld1 = fd0 + fd1;

Thought.STACK_COUNTER++;
return ab4;
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
    fb1 = ad1 < ad2;
    fb0 = !fb1;
    fb0 = ad3 < ad4;
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    double ld0 = 497.8023717765718;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
    fd0 *= -1;
    boolean lb1 = true;
    lb1 = fd1 > ld0;
    boolean lb2 = false;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought23.getInstance(ad2, ad3, ad4, fd0);
    lb0 = fd1 > ad1;
    double ld2 = 424.28727518902207;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Thought lo3 = Thought42.getInstance(ab1, ab2, ab3, ab4);
    fb0 = fb1 || lb0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd0 = fd1 + ld2;
        ab1 = ad1 > ad2;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fb1 = lb0 || ab1;
        ab2 = ld2 > ad1;
        ab3 = ab4 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
}
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb0 = !fb1;
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fd0 = ao1.m3(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    if (fb0) {
        Thought lo0 = Thought58.getInstance();
        Output.points[3][0] += fd0;
if(ao2 != null){
          ao2.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fd1 *= -1;
        Output.points[3][1] += fd0;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
        fb0 = fb1 && fb0;
        fd1 = fd0 - fd1;
        fb1 = !fb0;
        fd0 = fd1 + fd0;
        Thought lo1 = Thought35.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
        Thought lo2 = Thought23.getInstance(fb1, fb0, fb1, fb0);
if(ao1 != null){
          ao1.m2();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    double ld0 = 945.5916906729002;
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
if(ao3 != null){
      ad2 = ao3.m3(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb1, fb0);
}
    fd0 = fd1 + ld0;
    fb1 = !lb1;
    ad1 = ad2 - ad3;
    Thought lo2 = Thought51.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fb0 = fd0 > fd1;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb1);
}
    fd0 = fd1 + ld0;
    ad1 = ad2 - ad3;
    fb0 = fb1 || lb1;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ld0);
}
    Output.points[3][2] -= ad1;

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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    Thought lo1 = Thought58.getInstance(lb0, ab1, ab2, ab3);
if(ao1 != null){
      ao1.m1();
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    boolean lb2 = true;
    Thought lo3 = Thought38.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
    lb2 = fd0 < fd1;
    Thought lo4 = Thought98.getInstance(fd0, fd1, fd0, fd1);
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
    fd0 = fd1 + fd0;
    lb0 = lb2 && ab1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
    lb0 = lb2 || ab1;
    boolean lb5 = true;
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 - ad3;
    boolean lb0 = true;
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
    ab1 = ad1 < ad2;
if(ao3 != null){
      ab2 = ao3.m2(ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought4.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
    Thought lo2 = Thought44.getInstance(ab3, ab4, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb3 = false;
    Output.points[3][3] += fd0;
    boolean lb4 = true;
    boolean lb5 = true;
    Output.points[3][4] -= fd1;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, lb0, lb3, lb4, lb5);
}
    ab1 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    ad1 *= -1;

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
    Thought lo0 = Thought13.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    Output.points[3][5] += fd1;
    Thought lo1 = Thought4.getInstance(fd0, fd1, fd0, fd1);
    boolean lb2 = false;
    double ld3 = 29.50716744520018;
    fb0 = fb1 || lb2;
    Thought lo4 = Thought34.getInstance(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3);
    fd0 = fd1 - ld3;

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
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    fd0 *= -1;
    boolean lb0 = false;
    Thought lo1 = Thought7.getInstance();
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
    boolean lb3 = false;
    fd0 *= -1;

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
    fb0 = fb1 && fb0;
    Thought lo0 = Thought14.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4);
}
    double ld1 = 319.5007387844171;
    fb0 = fb1 && fb0;
    ad4 *= -1;
    boolean lb2 = true;
    fb0 = !fb1;
    lb2 = fb0 && fb1;
    lb2 = fb0 && fb1;
    lb2 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3);
}
    ad4 *= -1;
    fb0 = fb1 || lb2;
    fd0 *= -1;
    fb0 = fd1 > ld1;
    double ld3 = 363.0903822709433;
if(fo0 != null){
      fo0.m1(fb1, lb2, fb0, fb1);
}
    ld3 = ad1 - ad2;
    lb2 = !fb0;

Thought.STACK_COUNTER++;
return ad3;
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
    ab1 = ab2 && ab3;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
if(fo1 != null){
          ad2 = fo1.m3();
}
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
        Output.points[3][6] -= ad2;
        lb0 = ad3 > ad4;
        fd0 = fd1 + ad1;
        double ld1 = 294.06516164583263;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        boolean lb2 = true;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
        lb2 = fd0 < fd1;
if(fo0 != null){
          ld1 = fo0.m3(ad1, ad2, ad3, ad4);
}
        ab1 = ab2 && ab3;
        ab4 = fb0 || fb1;
        if (lb0) {
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
}
            } else {
            lb2 = ab1 && ab2;
            double ld3 = 334.38285241444015;
            ad1 = ad2 + ad3;
if(fo1 != null){
              fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
            Output.points[3][7] -= ad4;
            boolean lb4 = false;
if(fo1 != null){
              fo0 = fo1.m4();
}
}}
Thought.STACK_COUNTER++;
return ad1;
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
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    fd0 *= -1;
    fd1 = fd0 - fd1;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    double ld0 = 720.3577703710511;
    fb0 = fd0 < fd1;
if(ao1 != null){
      ld0 = ao1.m3(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          ao2.m2();
}
    Output.points[3][8] += ad1;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = ld0 + ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    ad3 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
    Output.points[4][0] += fd1;
    fb1 = !lb1;
    fb0 = fb1 || lb1;
    ld0 = ad1 + ad2;
    double ld2 = 199.55231866351605;
    double ld3 = 458.5833273582922;
    fb0 = fb1 || lb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
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
    Thought lo0 = Thought33.getInstance(ao2, ao3, ao4, fo0);
    boolean lb1 = true;
    lb1 = fd0 < fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fb1, lb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m3(ab3, ab4, fb0, fb1);
}
    lb1 = ab1 && ab2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 *= -1;
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Output.points[4][1] += fd0;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3);
}
    lb1 = fd1 < fd0;
    ab1 = fd1 < fd0;
    Thought lo2 = Thought36.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    boolean lb3 = false;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb1, lb3);
}
        ab1 = ab2 || ab3;
if(ao1 != null){
          ao1.m1(fd0, fd1, fd0, fd1);
}
        ab4 = fd0 < fd1;
        double ld4 = 652.7484779990327;
        boolean lb5 = false;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ad2 *= -1;
    ab4 = fb0 || fb1;
    ab1 = ab2 && ab3;
    Thought lo0 = Thought88.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
    boolean lb1 = false;
    Output.points[4][2] -= ad1;
if(ao1 != null){
      fo1 = ao1.m4(ab3, ab4, fb0, fb1);
}
    double ld2 = 571.9337365424911;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ad4 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld2, ad1, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    Output.points[4][3] -= ad2;
    Output.points[4][4] += ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, ao1, ao2, ao3);
}
    double ld3 = 151.94259860271174;
    boolean lb4 = true;
    ad4 = fd0 + fd1;
    ld2 *= -1;
    boolean lb5 = false;
    lb1 = lb4 || lb5;
    ab1 = ab2 || ab3;
    double ld6 = 821.096961711604;
    ld3 = ld6 - ad1;
    double ld7 = 368.8437629133837;
    boolean lb8 = true;
    boolean lb9 = true;

Thought.STACK_COUNTER++;
return ad1;
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
    Thought lo0 = Thought6.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 = fd0 + fd1;
    Thought lo1 = Thought96.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    Thought lo2 = Thought35.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 296.0215815738814;
    boolean lb1 = true;
    Thought lo2 = Thought85.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
    ab1 = fd0 > fd1;
if(fo0 != null){
      fo0.m3(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo0.m3(ab3, ab4, fb0, fb1);
}
    lb1 = ab1 && ab2;
    ab3 = ab4 && fb0;
    Thought lo3 = Thought84.getInstance();
    fb1 = lb1 || ab1;
if(fo1 != null){
      fo1.m3(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = lb1 && ab1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ld0 = fd0 + fd1;
    Output.points[4][5] += ld0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    double ld4 = 755.1379880548595;

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
    ad1 = ad2 + ad3;
    boolean lb0 = false;
    ad4 = fd0 + fd1;
    Output.points[4][6] += ad1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    ad2 *= -1;
    fb0 = fb1 && lb0;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad1 = ad2 + ad3;
    lb0 = fb0 || fb1;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    fb0 = fb1 || lb0;
    ad2 = ad3 - ad4;
    double ld1 = 321.15324290344813;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fd0, fd1, ld1, ad1);
}
    fb0 = !fb1;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought34.getInstance();
    fd0 = fd1 - ad1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        double ld1 = 2.0574702508086857;
        fd0 = fd1 - ld1;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
        }
        ab3 = !ab4;
    Thought lo2 = Thought0.getInstance(ad1, ad2, ad3, ad4);
    boolean lb3 = false;
    ab4 = !fb0;
    fd0 = fd1 - ad1;
    Thought lo4 = Thought35.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fb1 = fo1.m2(lb3, ab1, ab2, ab3);
}
    Thought lo5 = Thought1.getInstance();
    ab4 = fd1 < ad1;
    fb0 = ad2 > ad3;
if(fo0 != null){
      fo0.m2(ad4, fd0, fd1, ad1, fb1, lb3, ab1, ab2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought70.getInstance(fd1, fd0, fd1, fd0);
    double ld1 = 3.2036041100977997;
    fb1 = fb0 && fb1;
    Output.points[4][7] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1);
}
    fb0 = !fb1;
    ld1 *= -1;
    fb0 = !fb1;
    fd0 = fd1 - ld1;
    fb0 = fd0 < fd1;
    Output.points[4][8] += ld1;
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought15.getInstance();
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, fd0, fb0, fb1, lb3, fb0);
}
    fd1 = ld1 - fd0;
    fd1 *= -1;
    fb1 = !lb3;
    Output.points[5][0] -= ld1;
    fd0 = fd1 - ld1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought42.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    Thought lo1 = Thought15.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
    fb1 = ad3 < ad4;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb2 = true;
    ad3 = ad4 + fd0;
    double ld3 = 299.287276906349;
    fd0 *= -1;
    lb2 = !fb0;
    fb1 = lb2 && fb0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ab1 = !ab2;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + fd0;
    Thought lo0 = Thought26.getInstance(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
    boolean lb1 = false;
    double ld2 = 307.6193215132098;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld2, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld2);
}
    ab4 = fb0 || fb1;
    lb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    if (fb0) {
        fb1 = ld2 > fd0;
        Thought lo3 = Thought89.getInstance();
        lb1 = !ab1;
if(ao2 != null){
          ao1 = ao2.m4(fd1, ld2, fd0, fd1, ab2, ab3, ab4, fb0);
}
        fb1 = lb1 || ab1;
        ab2 = !ab3;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    double ld0 = 810.7359674712815;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    fb1 = !ab1;
    boolean lb1 = true;
    boolean lb2 = false;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb2, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb1, lb2, ab1);
}
    boolean lb3 = false;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld0, ad1, ad2);
}
    Thought lo4 = Thought9.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
    ld0 = ad1 - ad2;
    boolean lb5 = true;
    lb5 = !ab1;
    boolean lb6 = false;
if(ao1 != null){
      fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fb0 = ao2.m2();
}

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
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought2.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m1();
}
    Thought lo2 = Thought33.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fb1 = fd1 > fd0;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    double ld3 = 696.995521565241;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
}
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    double ld1 = 416.83007876297745;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld2 = 637.9480334162783;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fb0 = fb1 && lb0;
    Output.points[5][1] -= ld1;
    fb0 = fb1 || lb0;
    ld2 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, ld2, fd0);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Thought lo0 = Thought28.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd1 > fd0;
    boolean lb1 = true;
    fd1 *= -1;
    Thought lo2 = Thought51.getInstance();
    fd0 *= -1;
    double ld3 = 171.14597595107264;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld3, fd0, fd1, fb0, fb1, lb1, fb0);
}
    Thought lo4 = Thought85.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, fb1, lb1, fb0, fb1);
}
    fd0 = fd1 - ld3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    fd0 = fd1 - ld3;
    fb0 = !fb1;
    lb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    boolean lb5 = false;
    Thought lo6 = Thought71.getInstance(ld3, fd0, fd1, ld3, lb1, lb5, fb0, fb1);
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0, lb5, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb5, fb0, fb1, lb1);
}
    fd1 *= -1;
    double ld7 = 423.5610130863964;

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
